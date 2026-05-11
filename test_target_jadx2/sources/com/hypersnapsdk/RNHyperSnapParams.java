package com.hypersnapsdk;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import java.util.HashMap;
import java.util.Map;

@K4.a(name = RNHyperSnapParams.NAME)
/* loaded from: classes2.dex */
public class RNHyperSnapParams extends ReactContextBaseJavaModule {
    public static final String DocumentA4 = "Document.A4";
    public static final String DocumentBack = "HVDocConfig.DocumentSide.BACK";
    public static final String DocumentCARD = "Document.CARD";
    public static final String DocumentFront = "HVDocConfig.DocumentSide.FRONT";
    public static final String DocumentOTHER = "Document.OTHER";
    public static final String DocumentPASSPORT = "Document.PASSPORT";
    public static final String FaceMatchModeFaceFace = "FaceMatchMode.FACE_FACE";
    public static final String FaceMatchModeFaceId = "FaceMatchMode.FACE_ID";
    public static final String FaceMatchModeFaceIdFaceString = "FaceMatchMode.FACE_ID_FACE_STRING";
    public static final String LivenessModeNONE = "LivenessMode.NONE";
    public static final String LivenessModeTEXTUREANDGESTURELIVENESS = "LivenessMode.TEXTUREANDGESTURELIVENESS";
    public static final String LivenessModeTEXTURELIVENESS = "LivenessMode.TEXTURELIVENESS";
    public static final String NAME = "RNHyperSnapParams";
    public static final String ProductFACEID = "Product.FACEID";
    public static final String ProductIAM = "Product.IAM";
    public static final String RegionAfrica = "Region.AFRICA";
    public static final String RegionAsiaPacific = "Region.AsiaPacific";
    public static final String RegionIndia = "Region.India";
    public static final String RegionUnitedStates = "Region.UnitedStates";

    public RNHyperSnapParams(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("RegionIndia", RegionIndia);
        hashMap.put("RegionAsiaPacific", RegionAsiaPacific);
        hashMap.put("RegionUnitedStates", RegionUnitedStates);
        hashMap.put("RegionAfrica", RegionAfrica);
        hashMap.put("ProductFaceID", ProductFACEID);
        hashMap.put("ProductIAM", ProductIAM);
        hashMap.put("DocumentTypeCard", DocumentCARD);
        hashMap.put("DocumentTypeA4", DocumentA4);
        hashMap.put("DocumentTypePassport", DocumentPASSPORT);
        hashMap.put("DocumentTypeOther", DocumentOTHER);
        hashMap.put("LivenessModeNone", LivenessModeNONE);
        hashMap.put("LivenessModeTextureLiveness", LivenessModeTEXTURELIVENESS);
        hashMap.put("LivenessModeTextureAndGestureLiveness", LivenessModeTEXTUREANDGESTURELIVENESS);
        hashMap.put("DocumentFront", DocumentFront);
        hashMap.put("DocumentBack", DocumentBack);
        hashMap.put("FaceMatchModeFaceId", FaceMatchModeFaceId);
        hashMap.put("FaceMatchModeFaceFace", FaceMatchModeFaceFace);
        hashMap.put("FaceMatchModeFaceIdFaceString", FaceMatchModeFaceIdFaceString);
        return hashMap;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }
}
