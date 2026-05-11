package androidx.work.impl;

import i1.AbstractC3312b;

/* loaded from: classes.dex */
class K extends AbstractC3312b {
    public K() {
        super(17, 18);
    }

    @Override // i1.AbstractC3312b
    public void a(l1.g gVar) {
        gVar.Z("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
        gVar.Z("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
    }
}
