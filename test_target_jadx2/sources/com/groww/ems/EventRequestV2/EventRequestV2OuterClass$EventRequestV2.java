package com.groww.ems.EventRequestV2;

import com.google.protobuf.AbstractC2891w;
import com.google.protobuf.AbstractC2893y;
import com.google.protobuf.O;
import com.google.protobuf.W;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class EventRequestV2OuterClass$EventRequestV2 extends AbstractC2891w implements O {
    private static final EventRequestV2OuterClass$EventRequestV2 DEFAULT_INSTANCE;
    private static volatile W PARSER;
    private int bitField0_;
    private long dpReqSerial_;
    private long sentTs_;
    private String reqId_ = BuildConfig.FLAVOR;
    private AbstractC2893y.b events_ = AbstractC2891w.emptyProtobufList();
    private String job_ = BuildConfig.FLAVOR;
    private String triggerAppState_ = BuildConfig.FLAVOR;

    public static final class a extends AbstractC2891w.a implements O {
        /* synthetic */ a(com.groww.ems.EventRequestV2.a aVar) {
            this();
        }

        public a o(EventRequestV2OuterClass$Event eventRequestV2OuterClass$Event) {
            i();
            ((EventRequestV2OuterClass$EventRequestV2) this.f28816b).addEvents(eventRequestV2OuterClass$Event);
            return this;
        }

        public a p(long j10) {
            i();
            ((EventRequestV2OuterClass$EventRequestV2) this.f28816b).setDpReqSerial(j10);
            return this;
        }

        public a q(String str) {
            i();
            ((EventRequestV2OuterClass$EventRequestV2) this.f28816b).setJob(str);
            return this;
        }

        public a s(String str) {
            i();
            ((EventRequestV2OuterClass$EventRequestV2) this.f28816b).setReqId(str);
            return this;
        }

        public a v(long j10) {
            i();
            ((EventRequestV2OuterClass$EventRequestV2) this.f28816b).setSentTs(j10);
            return this;
        }

        public a w(String str) {
            i();
            ((EventRequestV2OuterClass$EventRequestV2) this.f28816b).setTriggerAppState(str);
            return this;
        }

        private a() {
            super(EventRequestV2OuterClass$EventRequestV2.DEFAULT_INSTANCE);
        }
    }

    static {
        EventRequestV2OuterClass$EventRequestV2 eventRequestV2OuterClass$EventRequestV2 = new EventRequestV2OuterClass$EventRequestV2();
        DEFAULT_INSTANCE = eventRequestV2OuterClass$EventRequestV2;
        AbstractC2891w.registerDefaultInstance(EventRequestV2OuterClass$EventRequestV2.class, eventRequestV2OuterClass$EventRequestV2);
    }

    private EventRequestV2OuterClass$EventRequestV2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEvents(EventRequestV2OuterClass$Event eventRequestV2OuterClass$Event) {
        eventRequestV2OuterClass$Event.getClass();
        ensureEventsIsMutable();
        this.events_.add(eventRequestV2OuterClass$Event);
    }

    private void ensureEventsIsMutable() {
        AbstractC2893y.b bVar = this.events_;
        if (bVar.N()) {
            return;
        }
        this.events_ = AbstractC2891w.mutableCopy(bVar);
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDpReqSerial(long j10) {
        this.bitField0_ |= 2;
        this.dpReqSerial_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJob(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.job_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReqId(String str) {
        str.getClass();
        this.reqId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSentTs(long j10) {
        this.sentTs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTriggerAppState(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.triggerAppState_ = str;
    }

    @Override // com.google.protobuf.AbstractC2891w
    protected final Object dynamicMethod(AbstractC2891w.d dVar, Object obj, Object obj2) {
        com.groww.ems.EventRequestV2.a aVar = null;
        switch (com.groww.ems.EventRequestV2.a.f28826a[dVar.ordinal()]) {
            case 1:
                return new EventRequestV2OuterClass$EventRequestV2();
            case 2:
                return new a(aVar);
            case 3:
                return AbstractC2891w.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002\u0002\u0003\u001b\u0004ለ\u0000\u0005ဂ\u0001\u0006ለ\u0002", new Object[]{"bitField0_", "reqId_", "sentTs_", "events_", EventRequestV2OuterClass$Event.class, "job_", "dpReqSerial_", "triggerAppState_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                W w10 = PARSER;
                if (w10 == null) {
                    synchronized (EventRequestV2OuterClass$EventRequestV2.class) {
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
