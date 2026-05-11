"""Tests for the knowledge graph."""

from sentinel.memory.graph import KnowledgeGraph, NodeType, EdgeType


class TestKnowledgeGraph:
    def test_add_node(self):
        graph = KnowledgeGraph()
        graph.add_node("apk:1", NodeType.APK, package_name="com.test")
        node = graph.get_node("apk:1")
        assert node is not None
        assert node["type"] == "apk"
        assert node["package_name"] == "com.test"

    def test_add_edge(self):
        graph = KnowledgeGraph()
        graph.add_node("apk:1", NodeType.APK)
        graph.add_node("finding:1", NodeType.FINDING, severity="high")
        graph.add_edge("apk:1", "finding:1", EdgeType.HAS_FINDING)

        neighbors = graph.get_neighbors("apk:1")
        assert "finding:1" in neighbors

    def test_find_attack_paths(self):
        graph = KnowledgeGraph()
        graph.add_node("a", NodeType.FINDING)
        graph.add_node("b", NodeType.FINDING)
        graph.add_node("c", NodeType.EXPLOIT)
        graph.add_edge("a", "b", EdgeType.RELATES_TO)
        graph.add_edge("b", "c", EdgeType.CHAINS)

        paths = graph.find_attack_paths("a", "c")
        assert len(paths) == 1
        assert paths[0] == ["a", "b", "c"]

    def test_get_findings_for_node(self):
        graph = KnowledgeGraph()
        graph.add_node("apk:1", NodeType.APK)
        graph.add_node("f:1", NodeType.FINDING, severity="high", title="XSS")
        graph.add_node("f:2", NodeType.FINDING, severity="medium", title="Info leak")
        graph.add_edge("apk:1", "f:1", EdgeType.HAS_FINDING)
        graph.add_edge("apk:1", "f:2", EdgeType.HAS_FINDING)

        findings = graph.get_findings_for_node("apk:1")
        assert len(findings) == 2

    def test_get_stats(self):
        graph = KnowledgeGraph()
        graph.add_node("apk:1", NodeType.APK)
        graph.add_node("f:1", NodeType.FINDING, severity="high")
        graph.add_edge("apk:1", "f:1", EdgeType.HAS_FINDING)

        stats = graph.get_stats()
        assert stats["total_nodes"] == 2
        assert stats["total_edges"] == 1
        assert stats["node_types"]["finding"] == 1

    def test_export_graph(self):
        graph = KnowledgeGraph()
        graph.add_node("n1", NodeType.APK)
        data = graph.export_graph()
        assert "nodes" in data
        assert "edges" in data

    def test_nonexistent_node(self):
        graph = KnowledgeGraph()
        assert graph.get_node("nonexistent") is None
        assert graph.get_neighbors("nonexistent") == []
