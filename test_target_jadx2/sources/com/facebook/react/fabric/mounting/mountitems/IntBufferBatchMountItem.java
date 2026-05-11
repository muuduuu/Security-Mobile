package com.facebook.react.fabric.mounting.mountitems;

import G4.a;
import c3.AbstractC1721a;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.fabric.mounting.MountingManager;
import com.facebook.react.fabric.mounting.SurfaceMountingManager;
import com.facebook.react.uimanager.E0;
import org.conscrypt.BuildConfig;
import s5.C4313a;

/* loaded from: classes.dex */
final class IntBufferBatchMountItem implements BatchMountItem {
    static final int INSTRUCTION_CREATE = 2;
    static final int INSTRUCTION_DELETE = 4;
    static final int INSTRUCTION_FLAG_MULTIPLE = 1;
    static final int INSTRUCTION_INSERT = 8;
    static final int INSTRUCTION_REMOVE = 16;
    static final int INSTRUCTION_UPDATE_EVENT_EMITTER = 256;
    static final int INSTRUCTION_UPDATE_LAYOUT = 128;
    static final int INSTRUCTION_UPDATE_OVERFLOW_INSET = 1024;
    static final int INSTRUCTION_UPDATE_PADDING = 512;
    static final int INSTRUCTION_UPDATE_PROPS = 32;
    static final int INSTRUCTION_UPDATE_STATE = 64;
    static final String TAG = "IntBufferBatchMountItem";
    private final int mCommitNumber;
    private final int[] mIntBuffer;
    private final int mIntBufferLen;
    private final Object[] mObjBuffer;
    private final int mObjBufferLen;
    private final int mSurfaceId;

    IntBufferBatchMountItem(int i10, int[] iArr, Object[] objArr, int i11) {
        this.mSurfaceId = i10;
        this.mCommitNumber = i11;
        this.mIntBuffer = iArr;
        this.mObjBuffer = objArr;
        this.mIntBufferLen = iArr.length;
        this.mObjBufferLen = objArr.length;
    }

    private static String nameForInstructionString(int i10) {
        return i10 == 2 ? "CREATE" : i10 == 4 ? "DELETE" : i10 == 8 ? "INSERT" : i10 == 16 ? "REMOVE" : i10 == 32 ? "UPDATE_PROPS" : i10 == INSTRUCTION_UPDATE_STATE ? "UPDATE_STATE" : i10 == 128 ? "UPDATE_LAYOUT" : i10 == INSTRUCTION_UPDATE_PADDING ? "UPDATE_PADDING" : i10 == INSTRUCTION_UPDATE_OVERFLOW_INSET ? "UPDATE_OVERFLOW_INSET" : i10 == 256 ? "UPDATE_EVENT_EMITTER" : "UNKNOWN";
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public void execute(MountingManager mountingManager) {
        int i10;
        int i11;
        long j10;
        int i12;
        int i13;
        int i14;
        SurfaceMountingManager surfaceManager = mountingManager.getSurfaceManager(this.mSurfaceId);
        if (surfaceManager == null) {
            AbstractC1721a.o(TAG, "Skipping batch of MountItems; no SurfaceMountingManager found for [%d].", Integer.valueOf(this.mSurfaceId));
            return;
        }
        if (surfaceManager.isStopped()) {
            AbstractC1721a.o(TAG, "Skipping batch of MountItems; was stopped [%d].", Integer.valueOf(this.mSurfaceId));
            return;
        }
        if (a.f()) {
            AbstractC1721a.c(TAG, "Executing IntBufferBatchMountItem on surface [%d]", Integer.valueOf(this.mSurfaceId));
        }
        int i15 = 0;
        int i16 = 0;
        while (i15 < this.mIntBufferLen) {
            int[] iArr = this.mIntBuffer;
            int i17 = i15 + 1;
            int i18 = iArr[i15];
            int i19 = i18 & (-2);
            if ((i18 & 1) != 0) {
                int i20 = iArr[i17];
                i17 = i15 + 2;
                i10 = i20;
            } else {
                i10 = 1;
            }
            long j11 = 0;
            C4313a.d(0L, "IntBufferBatchMountItem::mountInstructions::" + nameForInstructionString(i19), new String[]{"numInstructions", String.valueOf(i10)}, 2);
            int i21 = i16;
            i15 = i17;
            int i22 = 0;
            while (i22 < i10) {
                if (i19 == 2) {
                    String fabricComponentName = FabricNameComponentMapping.getFabricComponentName((String) this.mObjBuffer[i21]);
                    int[] iArr2 = this.mIntBuffer;
                    int i23 = iArr2[i15];
                    Object[] objArr = this.mObjBuffer;
                    ReadableMap readableMap = (ReadableMap) objArr[i21 + 1];
                    int i24 = i21 + 3;
                    E0 e02 = (E0) objArr[i21 + 2];
                    i21 += 4;
                    int i25 = i15 + 2;
                    i11 = i22;
                    surfaceManager.createView(fabricComponentName, i23, readableMap, e02, (EventEmitterWrapper) objArr[i24], iArr2[i15 + 1] == 1);
                    i15 = i25;
                } else {
                    i11 = i22;
                    if (i19 == 4) {
                        surfaceManager.deleteView(this.mIntBuffer[i15]);
                        i15++;
                    } else if (i19 == 8) {
                        int[] iArr3 = this.mIntBuffer;
                        int i26 = iArr3[i15];
                        int i27 = i15 + 2;
                        int i28 = iArr3[i15 + 1];
                        i15 += 3;
                        surfaceManager.addViewAt(i28, i26, iArr3[i27]);
                    } else if (i19 == 16) {
                        int[] iArr4 = this.mIntBuffer;
                        int i29 = iArr4[i15];
                        int i30 = i15 + 2;
                        int i31 = iArr4[i15 + 1];
                        i15 += 3;
                        surfaceManager.removeViewAt(i29, i31, iArr4[i30]);
                    } else {
                        if (i19 == 32) {
                            i13 = i15 + 1;
                            i14 = i21 + 1;
                            surfaceManager.updateProps(this.mIntBuffer[i15], (ReadableMap) this.mObjBuffer[i21]);
                        } else if (i19 == INSTRUCTION_UPDATE_STATE) {
                            i13 = i15 + 1;
                            i14 = i21 + 1;
                            surfaceManager.updateState(this.mIntBuffer[i15], (E0) this.mObjBuffer[i21]);
                        } else {
                            if (i19 == 128) {
                                int[] iArr5 = this.mIntBuffer;
                                int i32 = iArr5[i15];
                                int i33 = iArr5[i15 + 1];
                                int i34 = iArr5[i15 + 2];
                                int i35 = iArr5[i15 + 3];
                                int i36 = iArr5[i15 + 4];
                                int i37 = iArr5[i15 + 5];
                                int i38 = i15 + 7;
                                int i39 = iArr5[i15 + 6];
                                if (a.o()) {
                                    j10 = 0;
                                    surfaceManager.updateLayout(i32, i33, i34, i35, i36, i37, i39, this.mIntBuffer[i38]);
                                    i38 = i15 + 8;
                                } else {
                                    j10 = 0;
                                    surfaceManager.updateLayout(i32, i33, i34, i35, i36, i37, i39, 0);
                                }
                                i15 = i38;
                            } else {
                                j10 = 0;
                                if (i19 == INSTRUCTION_UPDATE_PADDING) {
                                    int[] iArr6 = this.mIntBuffer;
                                    i12 = i15 + 5;
                                    surfaceManager.updatePadding(iArr6[i15], iArr6[i15 + 1], iArr6[i15 + 2], iArr6[i15 + 3], iArr6[i15 + 4]);
                                } else if (i19 == INSTRUCTION_UPDATE_OVERFLOW_INSET) {
                                    int[] iArr7 = this.mIntBuffer;
                                    i12 = i15 + 5;
                                    surfaceManager.updateOverflowInset(iArr7[i15], iArr7[i15 + 1], iArr7[i15 + 2], iArr7[i15 + 3], iArr7[i15 + 4]);
                                } else {
                                    if (i19 != 256) {
                                        throw new IllegalArgumentException("Invalid type argument to IntBufferBatchMountItem: " + i19 + " at index: " + i15);
                                    }
                                    surfaceManager.updateEventEmitter(this.mIntBuffer[i15], (EventEmitterWrapper) this.mObjBuffer[i21]);
                                    i15++;
                                    i21++;
                                }
                                i15 = i12;
                            }
                            i22 = i11 + 1;
                            j11 = j10;
                        }
                        i15 = i13;
                        i21 = i14;
                    }
                }
                j10 = 0;
                i22 = i11 + 1;
                j11 = j10;
            }
            C4313a.i(j11);
            i16 = i21;
        }
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public int getSurfaceId() {
        return this.mSurfaceId;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.BatchMountItem
    public boolean isBatchEmpty() {
        return this.mIntBufferLen == 0;
    }

    public String toString() {
        int i10;
        int i11;
        int i12;
        int i13;
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(String.format("IntBufferBatchMountItem [surface:%d]:\n", Integer.valueOf(this.mSurfaceId)));
            int i14 = 0;
            int i15 = 0;
            while (i14 < this.mIntBufferLen) {
                int[] iArr = this.mIntBuffer;
                int i16 = i14 + 1;
                int i17 = iArr[i14];
                int i18 = i17 & (-2);
                int i19 = 1;
                if ((i17 & 1) != 0) {
                    i19 = iArr[i16];
                    i16 = i14 + 2;
                }
                i14 = i16;
                for (int i20 = 0; i20 < i19; i20++) {
                    if (i18 == 2) {
                        String fabricComponentName = FabricNameComponentMapping.getFabricComponentName((String) this.mObjBuffer[i15]);
                        i15 += 4;
                        int i21 = i14 + 1;
                        Integer valueOf = Integer.valueOf(this.mIntBuffer[i14]);
                        i14 += 2;
                        sb2.append(String.format("CREATE [%d] - layoutable:%d - %s\n", valueOf, Integer.valueOf(this.mIntBuffer[i21]), fabricComponentName));
                    } else {
                        if (i18 == 4) {
                            i10 = i14 + 1;
                            sb2.append(String.format("DELETE [%d]\n", Integer.valueOf(this.mIntBuffer[i14])));
                        } else if (i18 == 8) {
                            Integer valueOf2 = Integer.valueOf(this.mIntBuffer[i14]);
                            int i22 = i14 + 2;
                            Integer valueOf3 = Integer.valueOf(this.mIntBuffer[i14 + 1]);
                            i14 += 3;
                            sb2.append(String.format("INSERT [%d]->[%d] @%d\n", valueOf2, valueOf3, Integer.valueOf(this.mIntBuffer[i22])));
                        } else if (i18 == 16) {
                            Integer valueOf4 = Integer.valueOf(this.mIntBuffer[i14]);
                            int i23 = i14 + 2;
                            Integer valueOf5 = Integer.valueOf(this.mIntBuffer[i14 + 1]);
                            i14 += 3;
                            sb2.append(String.format("REMOVE [%d]->[%d] @%d\n", valueOf4, valueOf5, Integer.valueOf(this.mIntBuffer[i23])));
                        } else {
                            if (i18 == 32) {
                                i12 = i15 + 1;
                                Object obj = this.mObjBuffer[i15];
                                i13 = i14 + 1;
                                sb2.append(String.format("UPDATE PROPS [%d]: %s\n", Integer.valueOf(this.mIntBuffer[i14]), FabricUIManager.IS_DEVELOPMENT_ENVIRONMENT ? obj != null ? obj.toString() : "<null>" : "<hidden>"));
                            } else if (i18 == INSTRUCTION_UPDATE_STATE) {
                                i12 = i15 + 1;
                                E0 e02 = (E0) this.mObjBuffer[i15];
                                i13 = i14 + 1;
                                sb2.append(String.format("UPDATE STATE [%d]: %s\n", Integer.valueOf(this.mIntBuffer[i14]), FabricUIManager.IS_DEVELOPMENT_ENVIRONMENT ? e02 != null ? e02.toString() : "<null>" : "<hidden>"));
                            } else if (i18 == 128) {
                                int[] iArr2 = this.mIntBuffer;
                                int i24 = iArr2[i14];
                                int i25 = iArr2[i14 + 1];
                                int i26 = iArr2[i14 + 2];
                                int i27 = iArr2[i14 + 3];
                                int i28 = iArr2[i14 + 4];
                                int i29 = iArr2[i14 + 5];
                                int i30 = i14 + 7;
                                int i31 = iArr2[i14 + 6];
                                if (a.o()) {
                                    i11 = this.mIntBuffer[i30];
                                    i30 = i14 + 8;
                                } else {
                                    i11 = 0;
                                }
                                sb2.append(String.format("UPDATE LAYOUT [%d]->[%d]: x:%d y:%d w:%d h:%d displayType:%d layoutDirection: %d\n", Integer.valueOf(i25), Integer.valueOf(i24), Integer.valueOf(i26), Integer.valueOf(i27), Integer.valueOf(i28), Integer.valueOf(i29), Integer.valueOf(i31), Integer.valueOf(i11)));
                                i14 = i30;
                            } else if (i18 == INSTRUCTION_UPDATE_PADDING) {
                                Integer valueOf6 = Integer.valueOf(this.mIntBuffer[i14]);
                                Integer valueOf7 = Integer.valueOf(this.mIntBuffer[i14 + 1]);
                                Integer valueOf8 = Integer.valueOf(this.mIntBuffer[i14 + 2]);
                                int i32 = i14 + 4;
                                Integer valueOf9 = Integer.valueOf(this.mIntBuffer[i14 + 3]);
                                i14 += 5;
                                sb2.append(String.format("UPDATE PADDING [%d]: top:%d right:%d bottom:%d left:%d\n", valueOf6, valueOf7, valueOf8, valueOf9, Integer.valueOf(this.mIntBuffer[i32])));
                            } else if (i18 == INSTRUCTION_UPDATE_OVERFLOW_INSET) {
                                Integer valueOf10 = Integer.valueOf(this.mIntBuffer[i14]);
                                Integer valueOf11 = Integer.valueOf(this.mIntBuffer[i14 + 1]);
                                Integer valueOf12 = Integer.valueOf(this.mIntBuffer[i14 + 2]);
                                int i33 = i14 + 4;
                                Integer valueOf13 = Integer.valueOf(this.mIntBuffer[i14 + 3]);
                                i14 += 5;
                                sb2.append(String.format("UPDATE OVERFLOWINSET [%d]: left:%d top:%d right:%d bottom:%d\n", valueOf10, valueOf11, valueOf12, valueOf13, Integer.valueOf(this.mIntBuffer[i33])));
                            } else {
                                if (i18 != 256) {
                                    AbstractC1721a.m(TAG, "String so far: " + sb2.toString());
                                    throw new IllegalArgumentException("Invalid type argument to IntBufferBatchMountItem: " + i18 + " at index: " + i14);
                                }
                                i15++;
                                i10 = i14 + 1;
                                sb2.append(String.format("UPDATE EVENTEMITTER [%d]\n", Integer.valueOf(this.mIntBuffer[i14])));
                            }
                            i14 = i13;
                            i15 = i12;
                        }
                        i14 = i10;
                    }
                }
            }
            return sb2.toString();
        } catch (Exception e10) {
            AbstractC1721a.n(TAG, "Caught exception trying to print", e10);
            StringBuilder sb3 = new StringBuilder();
            for (int i34 = 0; i34 < this.mIntBufferLen; i34++) {
                sb3.append(this.mIntBuffer[i34]);
                sb3.append(", ");
            }
            AbstractC1721a.m(TAG, sb3.toString());
            for (int i35 = 0; i35 < this.mObjBufferLen; i35++) {
                String str = TAG;
                Object obj2 = this.mObjBuffer[i35];
                AbstractC1721a.m(str, obj2 != null ? obj2.toString() : "null");
            }
            return BuildConfig.FLAVOR;
        }
    }
}
