package io.sentry;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes2.dex */
public class P1 {
    static final K1 DEFAULT_DIAGNOSTIC_LEVEL = K1.DEBUG;
    private static final String DEFAULT_ENVIRONMENT = "production";
    public static final String DEFAULT_PROPAGATION_TARGETS = ".*";
    private boolean attachServerName;
    private boolean attachStacktrace;
    private boolean attachThreads;
    private a beforeBreadcrumb;
    private b beforeSend;
    private c beforeSendTransaction;
    private final Set<String> bundleIds;
    private String cacheDirPath;
    io.sentry.clientreport.g clientReportRecorder;
    private final List<I> collectors;
    private int connectionTimeoutMillis;
    private final List<String> contextTags;
    private InterfaceC3413g1 dateProvider;
    private boolean debug;
    private io.sentry.internal.debugmeta.a debugMetaLoader;
    private final List<String> defaultTracePropagationTargets;
    private K1 diagnosticLevel;
    private String dist;
    private String distinctId;
    private String dsn;
    private String dsnHash;
    private boolean enableAutoSessionTracking;
    private boolean enableDeduplication;
    private boolean enableExternalConfiguration;
    private boolean enableNdk;
    private boolean enablePrettySerializationOutput;
    private boolean enableScopeSync;
    private boolean enableShutdownHook;
    private boolean enableTimeToFullDisplayTracing;
    private Boolean enableTracing;
    private boolean enableUncaughtExceptionHandler;
    private boolean enableUserInteractionBreadcrumbs;
    private boolean enableUserInteractionTracing;
    private boolean enabled;
    private io.sentry.cache.f envelopeDiskCache;
    private J envelopeReader;
    private String environment;
    private final List<InterfaceC3466x> eventProcessors;
    private P executorService;
    private long flushTimeoutMillis;
    private final C3472z fullyDisplayedReporter;
    private final List<io.sentry.internal.gestures.a> gestureTargetLocators;
    private HostnameVerifier hostnameVerifier;
    private Long idleTimeout;
    private List<String> ignoredCheckIns;
    private final Set<Class<? extends Throwable>> ignoredExceptionsForType;
    private final List<String> inAppExcludes;
    private final List<String> inAppIncludes;
    private W instrumenter;
    private final List<Integration> integrations;
    private ILogger logger;
    private io.sentry.util.thread.a mainThreadChecker;
    private long maxAttachmentSize;
    private int maxBreadcrumbs;
    private int maxCacheItems;
    private int maxDepth;
    private int maxQueueSize;
    private f maxRequestBodySize;
    private int maxSpans;
    private long maxTraceFileSize;
    private io.sentry.internal.modules.b modulesLoader;
    private final List<N> observers;
    private final List<M> optionsObservers;
    private boolean printUncaughtStackTrace;
    private Double profilesSampleRate;
    private d profilesSampler;
    private String proguardUuid;
    private e proxy;
    private int readTimeoutMillis;
    private String release;
    private Double sampleRate;
    private io.sentry.protocol.p sdkVersion;
    private boolean sendClientReports;
    private boolean sendDefaultPii;
    private boolean sendModules;
    private String sentryClientName;
    private Q serializer;
    private String serverName;
    private long sessionTrackingIntervalMillis;
    private long shutdownTimeoutMillis;
    private SSLSocketFactory sslSocketFactory;
    private final Map<String, String> tags;
    private boolean traceOptionsRequests;
    private List<String> tracePropagationTargets;
    private boolean traceSampling;
    private Double tracesSampleRate;
    private g tracesSampler;
    private r2 transactionPerformanceCollector;
    private U transactionProfiler;
    private V transportFactory;
    private io.sentry.transport.q transportGate;
    private final List<Object> viewHierarchyExporters;

    public interface a {
    }

    public interface b {
        A1 a(A1 a12, A a10);
    }

    public interface c {
    }

    public interface d {
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        private String f34544a;

        /* renamed from: b, reason: collision with root package name */
        private String f34545b;

        /* renamed from: c, reason: collision with root package name */
        private String f34546c;

        /* renamed from: d, reason: collision with root package name */
        private String f34547d;

        public e(String str, String str2, String str3, String str4) {
            this.f34544a = str;
            this.f34545b = str2;
            this.f34546c = str3;
            this.f34547d = str4;
        }

        public String a() {
            return this.f34544a;
        }

        public String b() {
            return this.f34547d;
        }

        public String c() {
            return this.f34545b;
        }

        public String d() {
            return this.f34546c;
        }
    }

    public enum f {
        NONE,
        SMALL,
        MEDIUM,
        ALWAYS
    }

    public interface g {
    }

    public P1() {
        this(false);
    }

    private void a() {
        I1.c().b("maven:io.sentry:sentry", "6.30.0");
    }

    private io.sentry.protocol.p createSdkVersion() {
        io.sentry.protocol.p pVar = new io.sentry.protocol.p("sentry.java", "6.30.0");
        pVar.j("6.30.0");
        return pVar;
    }

    static P1 empty() {
        return new P1(true);
    }

    public void addBundleId(String str) {
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            this.bundleIds.add(trim);
        }
    }

    public void addCollector(I i10) {
        this.collectors.add(i10);
    }

    public void addContextTag(String str) {
        this.contextTags.add(str);
    }

    public void addEventProcessor(InterfaceC3466x interfaceC3466x) {
        this.eventProcessors.add(interfaceC3466x);
    }

    public void addIgnoredExceptionForType(Class<? extends Throwable> cls) {
        this.ignoredExceptionsForType.add(cls);
    }

    public void addInAppExclude(String str) {
        this.inAppExcludes.add(str);
    }

    public void addInAppInclude(String str) {
        this.inAppIncludes.add(str);
    }

    public void addIntegration(Integration integration) {
        this.integrations.add(integration);
    }

    public void addOptionsObserver(M m10) {
        this.optionsObservers.add(m10);
    }

    public void addScopeObserver(N n10) {
        this.observers.add(n10);
    }

    @Deprecated
    public void addTracingOrigin(String str) {
        if (this.tracePropagationTargets == null) {
            this.tracePropagationTargets = new CopyOnWriteArrayList();
        }
        if (str.isEmpty()) {
            return;
        }
        this.tracePropagationTargets.add(str);
    }

    boolean containsIgnoredExceptionForType(Throwable th) {
        return this.ignoredExceptionsForType.contains(th.getClass());
    }

    public a getBeforeBreadcrumb() {
        return null;
    }

    public b getBeforeSend() {
        return this.beforeSend;
    }

    public c getBeforeSendTransaction() {
        return null;
    }

    public Set<String> getBundleIds() {
        return this.bundleIds;
    }

    public String getCacheDirPath() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.dsnHash != null ? new File(this.cacheDirPath, this.dsnHash).getAbsolutePath() : this.cacheDirPath;
    }

    public io.sentry.clientreport.g getClientReportRecorder() {
        return this.clientReportRecorder;
    }

    public List<I> getCollectors() {
        return this.collectors;
    }

    public int getConnectionTimeoutMillis() {
        return this.connectionTimeoutMillis;
    }

    public List<String> getContextTags() {
        return this.contextTags;
    }

    public InterfaceC3413g1 getDateProvider() {
        return this.dateProvider;
    }

    public io.sentry.internal.debugmeta.a getDebugMetaLoader() {
        return this.debugMetaLoader;
    }

    public K1 getDiagnosticLevel() {
        return this.diagnosticLevel;
    }

    public String getDist() {
        return this.dist;
    }

    public String getDistinctId() {
        return this.distinctId;
    }

    public String getDsn() {
        return this.dsn;
    }

    public Boolean getEnableTracing() {
        return this.enableTracing;
    }

    public io.sentry.cache.f getEnvelopeDiskCache() {
        return this.envelopeDiskCache;
    }

    public J getEnvelopeReader() {
        return this.envelopeReader;
    }

    public String getEnvironment() {
        String str = this.environment;
        return str != null ? str : DEFAULT_ENVIRONMENT;
    }

    public List<InterfaceC3466x> getEventProcessors() {
        return this.eventProcessors;
    }

    public P getExecutorService() {
        return this.executorService;
    }

    public long getFlushTimeoutMillis() {
        return this.flushTimeoutMillis;
    }

    public C3472z getFullyDisplayedReporter() {
        return this.fullyDisplayedReporter;
    }

    public List<io.sentry.internal.gestures.a> getGestureTargetLocators() {
        return this.gestureTargetLocators;
    }

    public HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    public Long getIdleTimeout() {
        return this.idleTimeout;
    }

    public List<String> getIgnoredCheckIns() {
        return this.ignoredCheckIns;
    }

    public Set<Class<? extends Throwable>> getIgnoredExceptionsForType() {
        return this.ignoredExceptionsForType;
    }

    public List<String> getInAppExcludes() {
        return this.inAppExcludes;
    }

    public List<String> getInAppIncludes() {
        return this.inAppIncludes;
    }

    public W getInstrumenter() {
        return this.instrumenter;
    }

    public List<Integration> getIntegrations() {
        return this.integrations;
    }

    public ILogger getLogger() {
        return this.logger;
    }

    public io.sentry.util.thread.a getMainThreadChecker() {
        return this.mainThreadChecker;
    }

    public long getMaxAttachmentSize() {
        return this.maxAttachmentSize;
    }

    public int getMaxBreadcrumbs() {
        return this.maxBreadcrumbs;
    }

    public int getMaxCacheItems() {
        return this.maxCacheItems;
    }

    public int getMaxDepth() {
        return this.maxDepth;
    }

    public int getMaxQueueSize() {
        return this.maxQueueSize;
    }

    public f getMaxRequestBodySize() {
        return this.maxRequestBodySize;
    }

    public int getMaxSpans() {
        return this.maxSpans;
    }

    public long getMaxTraceFileSize() {
        return this.maxTraceFileSize;
    }

    public io.sentry.internal.modules.b getModulesLoader() {
        return this.modulesLoader;
    }

    public List<M> getOptionsObservers() {
        return this.optionsObservers;
    }

    public String getOutboxPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "outbox").getAbsolutePath();
    }

    public Double getProfilesSampleRate() {
        return this.profilesSampleRate;
    }

    public d getProfilesSampler() {
        return null;
    }

    public String getProfilingTracesDirPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "profiling_traces").getAbsolutePath();
    }

    public String getProguardUuid() {
        return this.proguardUuid;
    }

    public e getProxy() {
        return this.proxy;
    }

    public int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public String getRelease() {
        return this.release;
    }

    public Double getSampleRate() {
        return this.sampleRate;
    }

    public List<N> getScopeObservers() {
        return this.observers;
    }

    public io.sentry.protocol.p getSdkVersion() {
        return this.sdkVersion;
    }

    public String getSentryClientName() {
        return this.sentryClientName;
    }

    public Q getSerializer() {
        return this.serializer;
    }

    public String getServerName() {
        return this.serverName;
    }

    public long getSessionTrackingIntervalMillis() {
        return this.sessionTrackingIntervalMillis;
    }

    @Deprecated
    public long getShutdownTimeout() {
        return this.shutdownTimeoutMillis;
    }

    public long getShutdownTimeoutMillis() {
        return this.shutdownTimeoutMillis;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public List<String> getTracePropagationTargets() {
        List<String> list = this.tracePropagationTargets;
        return list == null ? this.defaultTracePropagationTargets : list;
    }

    public Double getTracesSampleRate() {
        return this.tracesSampleRate;
    }

    public g getTracesSampler() {
        return null;
    }

    @Deprecated
    public List<String> getTracingOrigins() {
        return getTracePropagationTargets();
    }

    public r2 getTransactionPerformanceCollector() {
        return this.transactionPerformanceCollector;
    }

    public U getTransactionProfiler() {
        return this.transactionProfiler;
    }

    public V getTransportFactory() {
        return this.transportFactory;
    }

    public io.sentry.transport.q getTransportGate() {
        return this.transportGate;
    }

    public final List<Object> getViewHierarchyExporters() {
        return this.viewHierarchyExporters;
    }

    public boolean isAttachServerName() {
        return this.attachServerName;
    }

    public boolean isAttachStacktrace() {
        return this.attachStacktrace;
    }

    public boolean isAttachThreads() {
        return this.attachThreads;
    }

    public boolean isDebug() {
        return this.debug;
    }

    public boolean isEnableAutoSessionTracking() {
        return this.enableAutoSessionTracking;
    }

    public boolean isEnableDeduplication() {
        return this.enableDeduplication;
    }

    public boolean isEnableExternalConfiguration() {
        return this.enableExternalConfiguration;
    }

    public boolean isEnableNdk() {
        return this.enableNdk;
    }

    public boolean isEnablePrettySerializationOutput() {
        return this.enablePrettySerializationOutput;
    }

    public boolean isEnableScopeSync() {
        return this.enableScopeSync;
    }

    public boolean isEnableShutdownHook() {
        return this.enableShutdownHook;
    }

    public boolean isEnableTimeToFullDisplayTracing() {
        return this.enableTimeToFullDisplayTracing;
    }

    public boolean isEnableUncaughtExceptionHandler() {
        return this.enableUncaughtExceptionHandler;
    }

    public boolean isEnableUserInteractionBreadcrumbs() {
        return this.enableUserInteractionBreadcrumbs;
    }

    public boolean isEnableUserInteractionTracing() {
        return this.enableUserInteractionTracing;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public boolean isPrintUncaughtStackTrace() {
        return this.printUncaughtStackTrace;
    }

    public boolean isProfilingEnabled() {
        if (getProfilesSampleRate() != null && getProfilesSampleRate().doubleValue() > 0.0d) {
            return true;
        }
        getProfilesSampler();
        return false;
    }

    public boolean isSendClientReports() {
        return this.sendClientReports;
    }

    public boolean isSendDefaultPii() {
        return this.sendDefaultPii;
    }

    public boolean isSendModules() {
        return this.sendModules;
    }

    public boolean isTraceOptionsRequests() {
        return this.traceOptionsRequests;
    }

    public boolean isTraceSampling() {
        return this.traceSampling;
    }

    public boolean isTracingEnabled() {
        Boolean bool = this.enableTracing;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (getTracesSampleRate() != null) {
            return true;
        }
        getTracesSampler();
        return false;
    }

    public void merge(C3469y c3469y) {
        if (c3469y.l() != null) {
            setDsn(c3469y.l());
        }
        if (c3469y.p() != null) {
            setEnvironment(c3469y.p());
        }
        if (c3469y.z() != null) {
            setRelease(c3469y.z());
        }
        if (c3469y.k() != null) {
            setDist(c3469y.k());
        }
        if (c3469y.B() != null) {
            setServerName(c3469y.B());
        }
        if (c3469y.y() != null) {
            setProxy(c3469y.y());
        }
        if (c3469y.o() != null) {
            setEnableUncaughtExceptionHandler(c3469y.o().booleanValue());
        }
        if (c3469y.v() != null) {
            setPrintUncaughtStackTrace(c3469y.v().booleanValue());
        }
        if (c3469y.n() != null) {
            setEnableTracing(c3469y.n());
        }
        if (c3469y.E() != null) {
            setTracesSampleRate(c3469y.E());
        }
        if (c3469y.w() != null) {
            setProfilesSampleRate(c3469y.w());
        }
        if (c3469y.j() != null) {
            setDebug(c3469y.j().booleanValue());
        }
        if (c3469y.m() != null) {
            setEnableDeduplication(c3469y.m().booleanValue());
        }
        if (c3469y.A() != null) {
            setSendClientReports(c3469y.A().booleanValue());
        }
        for (Map.Entry entry : new HashMap(c3469y.C()).entrySet()) {
            this.tags.put((String) entry.getKey(), (String) entry.getValue());
        }
        Iterator it = new ArrayList(c3469y.u()).iterator();
        while (it.hasNext()) {
            addInAppInclude((String) it.next());
        }
        Iterator it2 = new ArrayList(c3469y.t()).iterator();
        while (it2.hasNext()) {
            addInAppExclude((String) it2.next());
        }
        Iterator it3 = new HashSet(c3469y.s()).iterator();
        while (it3.hasNext()) {
            addIgnoredExceptionForType((Class) it3.next());
        }
        if (c3469y.D() != null) {
            setTracePropagationTargets(new ArrayList(c3469y.D()));
        }
        Iterator it4 = new ArrayList(c3469y.i()).iterator();
        while (it4.hasNext()) {
            addContextTag((String) it4.next());
        }
        if (c3469y.x() != null) {
            setProguardUuid(c3469y.x());
        }
        if (c3469y.q() != null) {
            setIdleTimeout(c3469y.q());
        }
        Iterator it5 = c3469y.h().iterator();
        while (it5.hasNext()) {
            addBundleId((String) it5.next());
        }
        if (c3469y.G() != null) {
            setEnabled(c3469y.G().booleanValue());
        }
        if (c3469y.F() != null) {
            setEnablePrettySerializationOutput(c3469y.F().booleanValue());
        }
        if (c3469y.H() != null) {
            setSendModules(c3469y.H().booleanValue());
        }
        if (c3469y.r() != null) {
            setIgnoredCheckIns(new ArrayList(c3469y.r()));
        }
    }

    public void setAttachServerName(boolean z10) {
        this.attachServerName = z10;
    }

    public void setAttachStacktrace(boolean z10) {
        this.attachStacktrace = z10;
    }

    public void setAttachThreads(boolean z10) {
        this.attachThreads = z10;
    }

    public void setBeforeBreadcrumb(a aVar) {
    }

    public void setBeforeSend(b bVar) {
        this.beforeSend = bVar;
    }

    public void setBeforeSendTransaction(c cVar) {
    }

    public void setCacheDirPath(String str) {
        this.cacheDirPath = str;
    }

    public void setConnectionTimeoutMillis(int i10) {
        this.connectionTimeoutMillis = i10;
    }

    public void setDateProvider(InterfaceC3413g1 interfaceC3413g1) {
        this.dateProvider = interfaceC3413g1;
    }

    public void setDebug(boolean z10) {
        this.debug = z10;
    }

    public void setDebugMetaLoader(io.sentry.internal.debugmeta.a aVar) {
        if (aVar == null) {
            aVar = io.sentry.internal.debugmeta.b.b();
        }
        this.debugMetaLoader = aVar;
    }

    public void setDiagnosticLevel(K1 k12) {
        if (k12 == null) {
            k12 = DEFAULT_DIAGNOSTIC_LEVEL;
        }
        this.diagnosticLevel = k12;
    }

    public void setDist(String str) {
        this.dist = str;
    }

    public void setDistinctId(String str) {
        this.distinctId = str;
    }

    public void setDsn(String str) {
        this.dsn = str;
        this.dsnHash = io.sentry.util.r.a(str, this.logger);
    }

    public void setEnableAutoSessionTracking(boolean z10) {
        this.enableAutoSessionTracking = z10;
    }

    public void setEnableDeduplication(boolean z10) {
        this.enableDeduplication = z10;
    }

    public void setEnableExternalConfiguration(boolean z10) {
        this.enableExternalConfiguration = z10;
    }

    public void setEnableNdk(boolean z10) {
        this.enableNdk = z10;
    }

    public void setEnablePrettySerializationOutput(boolean z10) {
        this.enablePrettySerializationOutput = z10;
    }

    public void setEnableScopeSync(boolean z10) {
        this.enableScopeSync = z10;
    }

    public void setEnableShutdownHook(boolean z10) {
        this.enableShutdownHook = z10;
    }

    public void setEnableTimeToFullDisplayTracing(boolean z10) {
        this.enableTimeToFullDisplayTracing = z10;
    }

    public void setEnableTracing(Boolean bool) {
        this.enableTracing = bool;
    }

    public void setEnableUncaughtExceptionHandler(boolean z10) {
        this.enableUncaughtExceptionHandler = z10;
    }

    public void setEnableUserInteractionBreadcrumbs(boolean z10) {
        this.enableUserInteractionBreadcrumbs = z10;
    }

    public void setEnableUserInteractionTracing(boolean z10) {
        this.enableUserInteractionTracing = z10;
    }

    public void setEnabled(boolean z10) {
        this.enabled = z10;
    }

    public void setEnvelopeDiskCache(io.sentry.cache.f fVar) {
        if (fVar == null) {
            fVar = io.sentry.transport.r.c();
        }
        this.envelopeDiskCache = fVar;
    }

    public void setEnvelopeReader(J j10) {
        if (j10 == null) {
            j10 = C3436o0.b();
        }
        this.envelopeReader = j10;
    }

    public void setEnvironment(String str) {
        this.environment = str;
    }

    public void setExecutorService(P p10) {
        if (p10 != null) {
            this.executorService = p10;
        }
    }

    public void setFlushTimeoutMillis(long j10) {
        this.flushTimeoutMillis = j10;
    }

    public void setGestureTargetLocators(List<io.sentry.internal.gestures.a> list) {
        this.gestureTargetLocators.clear();
        this.gestureTargetLocators.addAll(list);
    }

    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.hostnameVerifier = hostnameVerifier;
    }

    public void setIdleTimeout(Long l10) {
        this.idleTimeout = l10;
    }

    public void setIgnoredCheckIns(List<String> list) {
        if (list == null) {
            this.ignoredCheckIns = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(str);
            }
        }
        this.ignoredCheckIns = arrayList;
    }

    public void setInstrumenter(W w10) {
        this.instrumenter = w10;
    }

    public void setLogger(ILogger iLogger) {
        this.logger = iLogger == null ? C3446q0.e() : new C3432n(this, iLogger);
    }

    public void setMainThreadChecker(io.sentry.util.thread.a aVar) {
        this.mainThreadChecker = aVar;
    }

    public void setMaxAttachmentSize(long j10) {
        this.maxAttachmentSize = j10;
    }

    public void setMaxBreadcrumbs(int i10) {
        this.maxBreadcrumbs = i10;
    }

    public void setMaxCacheItems(int i10) {
        this.maxCacheItems = i10;
    }

    public void setMaxDepth(int i10) {
        this.maxDepth = i10;
    }

    public void setMaxQueueSize(int i10) {
        if (i10 > 0) {
            this.maxQueueSize = i10;
        }
    }

    public void setMaxRequestBodySize(f fVar) {
        this.maxRequestBodySize = fVar;
    }

    public void setMaxSpans(int i10) {
        this.maxSpans = i10;
    }

    public void setMaxTraceFileSize(long j10) {
        this.maxTraceFileSize = j10;
    }

    public void setModulesLoader(io.sentry.internal.modules.b bVar) {
        if (bVar == null) {
            bVar = io.sentry.internal.modules.e.b();
        }
        this.modulesLoader = bVar;
    }

    public void setPrintUncaughtStackTrace(boolean z10) {
        this.printUncaughtStackTrace = z10;
    }

    public void setProfilesSampleRate(Double d10) {
        if (io.sentry.util.q.a(d10)) {
            this.profilesSampleRate = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setProfilesSampler(d dVar) {
    }

    @Deprecated
    public void setProfilingEnabled(boolean z10) {
        if (getProfilesSampleRate() == null) {
            setProfilesSampleRate(z10 ? Double.valueOf(1.0d) : null);
        }
    }

    public void setProguardUuid(String str) {
        this.proguardUuid = str;
    }

    public void setProxy(e eVar) {
        this.proxy = eVar;
    }

    public void setReadTimeoutMillis(int i10) {
        this.readTimeoutMillis = i10;
    }

    public void setRelease(String str) {
        this.release = str;
    }

    public void setSampleRate(Double d10) {
        if (io.sentry.util.q.c(d10)) {
            this.sampleRate = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public void setSdkVersion(io.sentry.protocol.p pVar) {
        this.sdkVersion = pVar;
    }

    public void setSendClientReports(boolean z10) {
        this.sendClientReports = z10;
        if (z10) {
            this.clientReportRecorder = new io.sentry.clientreport.d(this);
        } else {
            this.clientReportRecorder = new io.sentry.clientreport.i();
        }
    }

    public void setSendDefaultPii(boolean z10) {
        this.sendDefaultPii = z10;
    }

    public void setSendModules(boolean z10) {
        this.sendModules = z10;
    }

    public void setSentryClientName(String str) {
        this.sentryClientName = str;
    }

    public void setSerializer(Q q10) {
        if (q10 == null) {
            q10 = C3458u0.f();
        }
        this.serializer = q10;
    }

    public void setServerName(String str) {
        this.serverName = str;
    }

    public void setSessionTrackingIntervalMillis(long j10) {
        this.sessionTrackingIntervalMillis = j10;
    }

    @Deprecated
    public void setShutdownTimeout(long j10) {
        this.shutdownTimeoutMillis = j10;
    }

    public void setShutdownTimeoutMillis(long j10) {
        this.shutdownTimeoutMillis = j10;
    }

    public void setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.sslSocketFactory = sSLSocketFactory;
    }

    public void setTag(String str, String str2) {
        this.tags.put(str, str2);
    }

    public void setTraceOptionsRequests(boolean z10) {
        this.traceOptionsRequests = z10;
    }

    public void setTracePropagationTargets(List<String> list) {
        if (list == null) {
            this.tracePropagationTargets = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(str);
            }
        }
        this.tracePropagationTargets = arrayList;
    }

    @Deprecated
    public void setTraceSampling(boolean z10) {
        this.traceSampling = z10;
    }

    public void setTracesSampleRate(Double d10) {
        if (io.sentry.util.q.d(d10)) {
            this.tracesSampleRate = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setTracesSampler(g gVar) {
    }

    @Deprecated
    public void setTracingOrigins(List<String> list) {
        setTracePropagationTargets(list);
    }

    public void setTransactionPerformanceCollector(r2 r2Var) {
        this.transactionPerformanceCollector = r2Var;
    }

    public void setTransactionProfiler(U u10) {
        if (u10 == null) {
            u10 = C3470y0.c();
        }
        this.transactionProfiler = u10;
    }

    public void setTransportFactory(V v10) {
        if (v10 == null) {
            v10 = C3473z0.b();
        }
        this.transportFactory = v10;
    }

    public void setTransportGate(io.sentry.transport.q qVar) {
        if (qVar == null) {
            qVar = io.sentry.transport.t.b();
        }
        this.transportGate = qVar;
    }

    public void setViewHierarchyExporters(List<Object> list) {
        this.viewHierarchyExporters.clear();
        this.viewHierarchyExporters.addAll(list);
    }

    private P1(boolean z10) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.eventProcessors = copyOnWriteArrayList;
        this.ignoredExceptionsForType = new CopyOnWriteArraySet();
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        this.integrations = copyOnWriteArrayList2;
        this.bundleIds = new CopyOnWriteArraySet();
        this.shutdownTimeoutMillis = 2000L;
        this.flushTimeoutMillis = 15000L;
        this.enableNdk = true;
        this.logger = C3446q0.e();
        this.diagnosticLevel = DEFAULT_DIAGNOSTIC_LEVEL;
        this.envelopeReader = new C3450s(new C3424k0(this));
        this.serializer = new C3424k0(this);
        this.maxDepth = 100;
        this.maxCacheItems = 30;
        this.maxQueueSize = 30;
        this.maxBreadcrumbs = 100;
        this.inAppExcludes = new CopyOnWriteArrayList();
        this.inAppIncludes = new CopyOnWriteArrayList();
        this.transportFactory = C3473z0.b();
        this.transportGate = io.sentry.transport.t.b();
        this.attachStacktrace = true;
        this.enableAutoSessionTracking = true;
        this.sessionTrackingIntervalMillis = 30000L;
        this.attachServerName = true;
        this.enableUncaughtExceptionHandler = true;
        this.printUncaughtStackTrace = false;
        this.executorService = C3454t0.e();
        this.connectionTimeoutMillis = 5000;
        this.readTimeoutMillis = 5000;
        this.envelopeDiskCache = io.sentry.transport.r.c();
        this.sendDefaultPii = false;
        this.observers = new CopyOnWriteArrayList();
        this.optionsObservers = new CopyOnWriteArrayList();
        this.tags = new ConcurrentHashMap();
        this.maxAttachmentSize = 20971520L;
        this.enableDeduplication = true;
        this.maxSpans = 1000;
        this.enableShutdownHook = true;
        this.maxRequestBodySize = f.NONE;
        this.traceSampling = true;
        this.maxTraceFileSize = 5242880L;
        this.transactionProfiler = C3470y0.c();
        this.tracePropagationTargets = null;
        this.defaultTracePropagationTargets = Collections.singletonList(DEFAULT_PROPAGATION_TARGETS);
        this.idleTimeout = 3000L;
        this.contextTags = new CopyOnWriteArrayList();
        this.sendClientReports = true;
        this.clientReportRecorder = new io.sentry.clientreport.d(this);
        this.modulesLoader = io.sentry.internal.modules.e.b();
        this.debugMetaLoader = io.sentry.internal.debugmeta.b.b();
        this.enableUserInteractionTracing = false;
        this.enableUserInteractionBreadcrumbs = true;
        this.instrumenter = W.SENTRY;
        this.gestureTargetLocators = new ArrayList();
        this.viewHierarchyExporters = new ArrayList();
        this.mainThreadChecker = io.sentry.util.thread.c.e();
        this.traceOptionsRequests = true;
        this.dateProvider = new Z0();
        this.collectors = new ArrayList();
        this.transactionPerformanceCollector = C3467x0.c();
        this.enableTimeToFullDisplayTracing = false;
        this.fullyDisplayedReporter = C3472z.a();
        this.enabled = true;
        this.enablePrettySerializationOutput = true;
        this.sendModules = true;
        this.ignoredCheckIns = null;
        if (z10) {
            return;
        }
        this.executorService = new C1();
        copyOnWriteArrayList2.add(new UncaughtExceptionHandlerIntegration());
        copyOnWriteArrayList2.add(new ShutdownHookIntegration());
        copyOnWriteArrayList.add(new C3427l0(this));
        copyOnWriteArrayList.add(new r(this));
        if (io.sentry.util.p.b()) {
            copyOnWriteArrayList.add(new Q1());
        }
        setSentryClientName("sentry.java/6.30.0");
        setSdkVersion(createSdkVersion());
        a();
    }
}
