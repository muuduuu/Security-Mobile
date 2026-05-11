package com.groww.ems.EventRequestV2;

import com.google.protobuf.AbstractC2891w;
import com.google.protobuf.O;
import com.google.protobuf.W;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class EventRequestV2OuterClass$UserContext extends AbstractC2891w implements O {
    private static final EventRequestV2OuterClass$UserContext DEFAULT_INSTANCE;
    private static volatile W PARSER;
    private int bitField0_;
    private String userName_ = BuildConfig.FLAVOR;
    private String emailId_ = BuildConfig.FLAVOR;
    private String userAccountId_ = BuildConfig.FLAVOR;
    private String country_ = BuildConfig.FLAVOR;
    private String cuid_ = BuildConfig.FLAVOR;
    private String dpLatitude_ = BuildConfig.FLAVOR;
    private String dpLongitude_ = BuildConfig.FLAVOR;

    public static final class a extends AbstractC2891w.a implements O {
        /* synthetic */ a(com.groww.ems.EventRequestV2.a aVar) {
            this();
        }

        public a o(String str) {
            i();
            ((EventRequestV2OuterClass$UserContext) this.f28816b).setCuid(str);
            return this;
        }

        public a p(String str) {
            i();
            ((EventRequestV2OuterClass$UserContext) this.f28816b).setEmailId(str);
            return this;
        }

        public a q(String str) {
            i();
            ((EventRequestV2OuterClass$UserContext) this.f28816b).setUserAccountId(str);
            return this;
        }

        public a s(String str) {
            i();
            ((EventRequestV2OuterClass$UserContext) this.f28816b).setUserName(str);
            return this;
        }

        private a() {
            super(EventRequestV2OuterClass$UserContext.DEFAULT_INSTANCE);
        }
    }

    static {
        EventRequestV2OuterClass$UserContext eventRequestV2OuterClass$UserContext = new EventRequestV2OuterClass$UserContext();
        DEFAULT_INSTANCE = eventRequestV2OuterClass$UserContext;
        AbstractC2891w.registerDefaultInstance(EventRequestV2OuterClass$UserContext.class, eventRequestV2OuterClass$UserContext);
    }

    private EventRequestV2OuterClass$UserContext() {
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCuid(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.cuid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmailId(String str) {
        str.getClass();
        this.emailId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserAccountId(String str) {
        str.getClass();
        this.userAccountId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserName(String str) {
        str.getClass();
        this.userName_ = str;
    }

    @Override // com.google.protobuf.AbstractC2891w
    protected final Object dynamicMethod(AbstractC2891w.d dVar, Object obj, Object obj2) {
        com.groww.ems.EventRequestV2.a aVar = null;
        switch (com.groww.ems.EventRequestV2.a.f28826a[dVar.ordinal()]) {
            case 1:
                return new EventRequestV2OuterClass$UserContext();
            case 2:
                return new a(aVar);
            case 3:
                return AbstractC2891w.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004ለ\u0000\u0005ለ\u0001\u0006ለ\u0002\u0007ለ\u0003", new Object[]{"bitField0_", "userName_", "emailId_", "userAccountId_", "country_", "cuid_", "dpLatitude_", "dpLongitude_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                W w10 = PARSER;
                if (w10 == null) {
                    synchronized (EventRequestV2OuterClass$UserContext.class) {
                        try {
                            w10 = PARSER;
                            if (w10 == null) {
                                w10 = new AbstractC2891w.b(DEFAULT_INSTANCE);
                                PARSER = w10;
                            }
                        } finally {
                        }
                    }
                }
                return w10;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
