package co.hyperverge.hypersnapsdk.helpers;

import co.hyperverge.hypersnapsdk.data.models.FeatureConfig;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class HVFeatureConfigHelper {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "co.hyperverge.hypersnapsdk.helpers.HVFeatureConfigHelper";

    public static Map<String, FeatureConfig> extractFeatureMap(List<FeatureConfig> list, List<FeatureConfig> list2) {
        String str = TAG;
        HVLogUtils.d(str, "extractFeatureMap() called with: sdkFeatureConfigs = [" + list + "], vsFeatureConfigs = [" + list2 + "]");
        HashMap hashMap = new HashMap();
        processFeatureConfigs(hashMap, list);
        processFeatureConfigs(hashMap, list2);
        HVLogUtils.d(str, "extractFeatureMap: featureToggleMap: " + hashMap);
        return hashMap;
    }

    public static Map<String, FeatureConfig> getDefaultFeatureMap() {
        HVLogUtils.d(TAG, "getDefaultFeatureMap() called");
        return extractFeatureMap(Arrays.asList(FeatureConfig.builder().id("camera2").enable(false).overrides(Arrays.asList(FeatureConfig.Override.builder().brand("motorola").enable(true).models(Arrays.asList("xt2201-1", "motorola edge 30 pro", "xt-2201", "motorola edge 30 ultra", "pakf0002in")).build(), FeatureConfig.Override.builder().brand("comio").enable(true).models(Collections.singletonList("comio x1")).build(), FeatureConfig.Override.builder().brand("vivo").enable(true).models(Arrays.asList("v2047", "v2145", "v2117", "v1806", "v2230")).build(), FeatureConfig.Override.builder().brand("lg").enable(true).build(), FeatureConfig.Override.builder().brand("xiaomi").enable(true).models(Arrays.asList("poco x3", "2201123G", "2201122G", "M1903F11I", "2201123C", "22071212AG", "21121210C", "M2004J19C", "M2004J19G", "22081212C")).build(), FeatureConfig.Override.builder().brand("samsung").enable(true).models(Arrays.asList("sm-a315f", "sm-a505f", "sm-a305f", "sm-a037f", "sm-a336e", "sm-m315f", "sm-a105f", "sm-a105g", "sm-a105m", "sm-m536b", "sm-a105fn")).build(), FeatureConfig.Override.builder().brand("tcl").enable(true).models(Collections.singletonList("v2117")).build())).build(), FeatureConfig.builder().id(AppConstants.AUTO_CAM_SELECTION).enable(false).overrides(Arrays.asList(FeatureConfig.Override.builder().brand("infinix").enable(true).osVersions(Collections.singletonList(FeatureConfig.OS.builder().min(23).build())).cameraLevels(Arrays.asList(AppConstants.LEVEL_FULL, AppConstants.LEVEL_3)).build(), FeatureConfig.Override.builder().brand("huawei").enable(true).osVersions(Collections.singletonList(FeatureConfig.OS.builder().min(23).build())).cameraLevels(Arrays.asList(AppConstants.LEVEL_FULL, AppConstants.LEVEL_3, AppConstants.LEVEL_LIMITED)).build(), FeatureConfig.Override.builder().brand("tecno").enable(true).osVersions(Collections.singletonList(FeatureConfig.OS.builder().min(23).build())).cameraLevels(Arrays.asList(AppConstants.LEVEL_FULL, AppConstants.LEVEL_3)).build(), FeatureConfig.Override.builder().brand("motorola").enable(true).cameraLevels(Arrays.asList(AppConstants.LEVEL_FULL, AppConstants.LEVEL_3)).build(), FeatureConfig.Override.builder().brand("oneplus").enable(true).osVersions(Collections.singletonList(FeatureConfig.OS.builder().min(29).build())).cameraLevels(Arrays.asList(AppConstants.LEVEL_FULL, AppConstants.LEVEL_3)).build(), FeatureConfig.Override.builder().brand("google").enable(true).cameraLevels(Arrays.asList(AppConstants.LEVEL_FULL, AppConstants.LEVEL_3)).build(), FeatureConfig.Override.builder().brand("oppo").enable(true).osVersions(Collections.singletonList(FeatureConfig.OS.builder().min(31).build())).cameraLevels(Arrays.asList(AppConstants.LEVEL_FULL, AppConstants.LEVEL_3)).build(), FeatureConfig.Override.builder().brand("asus").enable(true).osVersions(Collections.singletonList(FeatureConfig.OS.builder().min(31).build())).cameraLevels(Arrays.asList(AppConstants.LEVEL_FULL, AppConstants.LEVEL_3)).build(), FeatureConfig.Override.builder().brand("realme").enable(true).osVersions(Collections.singletonList(FeatureConfig.OS.builder().min(30).build())).cameraLevels(Arrays.asList(AppConstants.LEVEL_FULL, AppConstants.LEVEL_3)).build(), FeatureConfig.Override.builder().brand("vivo").enable(true).osVersions(Collections.singletonList(FeatureConfig.OS.builder().min(30).build())).cameraLevels(Arrays.asList(AppConstants.LEVEL_FULL, AppConstants.LEVEL_3)).build(), FeatureConfig.Override.builder().brand("xiaomi").enable(true).osVersions(Collections.singletonList(FeatureConfig.OS.builder().min(30).build())).cameraLevels(Arrays.asList(AppConstants.LEVEL_FULL, AppConstants.LEVEL_3)).build())).build(), FeatureConfig.builder().id(AppConstants.FACE_DETECTION_FEATURE).enable(true).overrides(Arrays.asList(FeatureConfig.Override.builder().brand("huawei").enable(true).build(), FeatureConfig.Override.builder().brand("samsung").enable(true).models(Collections.singletonList("sm-m022g")).build())).build(), FeatureConfig.builder().id(AppConstants.IMAGE_INJECTION_FEATURE).enable(true).overrides(Collections.singletonList(FeatureConfig.Override.builder().brand("huawei").enable(false).build())).build(), FeatureConfig.builder().id(AppConstants.VIDEO_RECORDING_FEATURE).enable(true).overrides(Arrays.asList(FeatureConfig.Override.builder().brand("huawei").enable(false).build(), FeatureConfig.Override.builder().brand("xiaomi").enable(false).models(Collections.singletonList("M2012K11AI")).build())).build(), FeatureConfig.builder().id(AppConstants.SELFIE_AUTO_CAPTURE_FEATURE).enable(true).overrides(Collections.singletonList(FeatureConfig.Override.builder().brand("oppo").enable(false).models(Collections.singletonList("CPH1945")).build())).build(), FeatureConfig.builder().id(AppConstants.ORIENTATION_BACK_CAM_FEATURE).enable(false).overrides(Arrays.asList(FeatureConfig.Override.builder().brand("huawei").enable(true).models(Arrays.asList("stk-l22", "ine-lx2")).build(), FeatureConfig.Override.builder().brand("samsung").enable(true).models(Collections.singletonList("sm-m022g")).build())).build(), FeatureConfig.builder().id(AppConstants.READ_DOC_QR_FEATURE).enable(true).overrides(Collections.singletonList(FeatureConfig.Override.builder().brand("motorola").enable(false).models(Collections.singletonList("XT1052")).build())).build(), FeatureConfig.builder().id(AppConstants.ACTIVE_LIVENESS).enable(true).overrides(Collections.singletonList(FeatureConfig.Override.builder().brand("infinix").enable(false).build())).build(), FeatureConfig.builder().id(AppConstants.DOC_AUTO_CAPTURE).enable(true).overrides(Collections.singletonList(FeatureConfig.Override.builder().brand("infinix").enable(false).build())).build()), new ArrayList());
    }

    private static void processFeatureConfigs(HashMap<String, FeatureConfig> hashMap, List<FeatureConfig> list) {
        HVLogUtils.d(TAG, "processFeatureConfigs() called with: featureToggleMap = [" + hashMap + "], featureConfigs = [" + list + "]");
        for (FeatureConfig featureConfig : list) {
            featureConfig.shouldEnable();
            hashMap.put(featureConfig.getId(), featureConfig);
        }
    }
}
