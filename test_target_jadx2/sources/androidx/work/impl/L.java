package androidx.work.impl;

import i1.AbstractC3312b;

/* loaded from: classes.dex */
class L extends AbstractC3312b {
    public L() {
        super(18, 19);
    }

    @Override // i1.AbstractC3312b
    public void a(l1.g gVar) {
        gVar.Z("ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
    }
}
