"""Knowledge graph for attack path correlation."""

from __future__ import annotations

import logging
from enum import Enum
from typing import Any
from uuid import UUID

import networkx as nx

logger = logging.getLogger(__name__)


class NodeType(str, Enum):
    APK = "apk"
    FINDING = "finding"
    COMPONENT = "component"
    API_ENDPOINT = "api_endpoint"
    SECRET = "secret"
    DEVICE = "device"
    EXPLOIT = "exploit"
    PERMISSION = "permission"


class EdgeType(str, Enum):
    CONTAINS = "contains"
    HAS_FINDING = "has_finding"
    RELATES_TO = "relates_to"
    USES_SECRET = "uses_secret"
    CHAINS = "chains"
    DISCOVERED_IN = "discovered_in"
    REQUIRES = "requires"
    EXPLOITS = "exploits"


class KnowledgeGraph:
    """NetworkX-based knowledge graph for finding correlation.

    Stores relationships between APKs, findings, components, secrets,
    and exploits. Enables attack path queries and chain generation.
    """

    def __init__(self) -> None:
        self._graph = nx.DiGraph()

    def add_node(self, node_id: str, node_type: NodeType, **attrs: Any) -> None:
        self._graph.add_node(node_id, type=node_type.value, **attrs)

    def add_edge(self, source: str, target: str, edge_type: EdgeType, **attrs: Any) -> None:
        self._graph.add_edge(source, target, type=edge_type.value, **attrs)

    def get_node(self, node_id: str) -> dict[str, Any] | None:
        if node_id in self._graph:
            return dict(self._graph.nodes[node_id])
        return None

    def get_neighbors(self, node_id: str, edge_type: EdgeType | None = None) -> list[str]:
        if node_id not in self._graph:
            return []
        neighbors = list(self._graph.successors(node_id))
        if edge_type:
            neighbors = [
                n for n in neighbors
                if self._graph.edges[node_id, n].get("type") == edge_type.value
            ]
        return neighbors

    def find_attack_paths(self, source_id: str, target_id: str) -> list[list[str]]:
        """Find all paths from source to target (attack chains)."""
        try:
            return list(nx.all_simple_paths(self._graph, source_id, target_id, cutoff=10))
        except nx.NetworkXError:
            return []

    def get_findings_for_node(self, node_id: str) -> list[dict[str, Any]]:
        """Get all findings related to a node."""
        findings = []
        for neighbor in self.get_neighbors(node_id, EdgeType.HAS_FINDING):
            node_data = self.get_node(neighbor)
            if node_data and node_data.get("type") == NodeType.FINDING.value:
                findings.append(node_data)
        return findings

    def get_exploit_chains(self, finding_id: str) -> list[list[str]]:
        """Get all exploit chains that include a finding."""
        chains = []
        # Find all exploit nodes
        for node_id, data in self._graph.nodes(data=True):
            if data.get("type") == NodeType.EXPLOIT.value:
                paths = self.find_attack_paths(finding_id, node_id)
                chains.extend(paths)
        return chains

    def get_critical_nodes(self) -> list[dict[str, Any]]:
        """Find nodes with the most connections (high-value targets)."""
        centrality = nx.degree_centrality(self._graph)
        critical = sorted(centrality.items(), key=lambda x: x[1], reverse=True)[:20]
        return [
            {"id": node_id, "centrality": score, **self._graph.nodes[node_id]}
            for node_id, score in critical
        ]

    def add_apk(self, apk_id: str, package_name: str, **attrs: Any) -> None:
        self.add_node(apk_id, NodeType.APK, package_name=package_name, **attrs)

    def add_finding(
        self,
        finding_id: str,
        severity: str,
        category: str,
        title: str,
        **attrs: Any,
    ) -> None:
        self.add_node(
            finding_id, NodeType.FINDING,
            severity=severity, category=category, title=title, **attrs,
        )

    def link_finding_to_apk(self, finding_id: str, apk_id: str, source: str = "sast") -> None:
        self.add_edge(apk_id, finding_id, EdgeType.HAS_FINDING, source=source)

    def link_components_to_finding(self, component_id: str, finding_id: str) -> None:
        self.add_edge(component_id, finding_id, EdgeType.HAS_FINDING)

    def link_secret_to_finding(self, secret_id: str, finding_id: str) -> None:
        self.add_edge(secret_id, finding_id, EdgeType.USES_SECRET)

    def link_findings(self, finding_a: str, finding_b: str) -> None:
        self.add_edge(finding_a, finding_b, EdgeType.RELATES_TO)

    def export_graph(self) -> dict[str, Any]:
        """Export graph as dict for serialization."""
        return nx.node_link_data(self._graph)

    def get_stats(self) -> dict[str, int]:
        """Return graph statistics."""
        type_counts: dict[str, int] = {}
        for _, data in self._graph.nodes(data=True):
            t = data.get("type", "unknown")
            type_counts[t] = type_counts.get(t, 0) + 1
        return {
            "total_nodes": self._graph.number_of_nodes(),
            "total_edges": self._graph.number_of_edges(),
            "node_types": type_counts,
        }
