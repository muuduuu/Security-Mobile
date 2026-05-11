package co.hyperverge.hypersnapsdk.data;

import O8.c;
import java.io.Serializable;

/* loaded from: classes.dex */
public class RemoteConfig implements Serializable {

    @c(alternate = {"rudderStackConfig"}, value = "analyticsConfig")
    private AnalyticsConfig analyticsConfig;

    @c("use_branding")
    private boolean useBranding = true;

    @c("show_sdk_version")
    private boolean showSdkVersion = false;

    @c("mixpanelConfig")
    private MixpanelConfig mixpanelConfig = new MixpanelConfig();

    @c("useIpToGeo")
    private boolean useIpToGeo = false;

    @c("use_compression")
    private boolean useCompression = false;

    @c("use_analytics")
    private boolean useAnalytics = true;

    @c("useSelfieVideoRecording")
    private boolean useSelfieVideoRecording = false;

    @c("videoRecordingV2Config")
    private VideoRecordingV2Config videoRecordingV2Config = VideoRecordingV2Config.builder().build();

    @c("useCameraX")
    private boolean useCameraX = false;

    @c("enableInjectionChecks")
    private boolean enableInjectionChecks = true;

    @c("retakeOnStaticVideo")
    private boolean retakeOnStaticVideo = false;

    public static class AnalyticsConfig {

        @c("effectiveFrom")
        private String effectiveFrom;

        @c("loggingPercentage")
        private Integer loggingPercentage;

        public static class AnalyticsConfigBuilder {
            private String effectiveFrom;
            private Integer loggingPercentage;

            AnalyticsConfigBuilder() {
            }

            public AnalyticsConfig build() {
                return new AnalyticsConfig(this.loggingPercentage, this.effectiveFrom);
            }

            public AnalyticsConfigBuilder effectiveFrom(String str) {
                this.effectiveFrom = str;
                return this;
            }

            public AnalyticsConfigBuilder loggingPercentage(Integer num) {
                this.loggingPercentage = num;
                return this;
            }

            public String toString() {
                return "RemoteConfig.AnalyticsConfig.AnalyticsConfigBuilder(loggingPercentage=" + this.loggingPercentage + ", effectiveFrom=" + this.effectiveFrom + ")";
            }
        }

        AnalyticsConfig(Integer num, String str) {
            this.loggingPercentage = num;
            this.effectiveFrom = str;
        }

        public static AnalyticsConfigBuilder builder() {
            return new AnalyticsConfigBuilder();
        }

        protected boolean canEqual(Object obj) {
            return obj instanceof AnalyticsConfig;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AnalyticsConfig)) {
                return false;
            }
            AnalyticsConfig analyticsConfig = (AnalyticsConfig) obj;
            if (!analyticsConfig.canEqual(this)) {
                return false;
            }
            Integer loggingPercentage = getLoggingPercentage();
            Integer loggingPercentage2 = analyticsConfig.getLoggingPercentage();
            if (loggingPercentage != null ? !loggingPercentage.equals(loggingPercentage2) : loggingPercentage2 != null) {
                return false;
            }
            String effectiveFrom = getEffectiveFrom();
            String effectiveFrom2 = analyticsConfig.getEffectiveFrom();
            return effectiveFrom != null ? effectiveFrom.equals(effectiveFrom2) : effectiveFrom2 == null;
        }

        public String getEffectiveFrom() {
            return this.effectiveFrom;
        }

        public Integer getLoggingPercentage() {
            return this.loggingPercentage;
        }

        public int hashCode() {
            Integer loggingPercentage = getLoggingPercentage();
            int hashCode = loggingPercentage == null ? 43 : loggingPercentage.hashCode();
            String effectiveFrom = getEffectiveFrom();
            return ((hashCode + 59) * 59) + (effectiveFrom != null ? effectiveFrom.hashCode() : 43);
        }

        public void setEffectiveFrom(String str) {
            this.effectiveFrom = str;
        }

        public void setLoggingPercentage(Integer num) {
            this.loggingPercentage = num;
        }

        public String toString() {
            return "RemoteConfig.AnalyticsConfig(loggingPercentage=" + getLoggingPercentage() + ", effectiveFrom=" + getEffectiveFrom() + ")";
        }
    }

    public static class VideoRecordingV2Config implements Serializable {

        @c("enable")
        private boolean enable;

        @c("sendFrames")
        private boolean sendFrames;

        public static class VideoRecordingV2ConfigBuilder {
            private boolean enable;
            private boolean sendFrames;

            VideoRecordingV2ConfigBuilder() {
            }

            public VideoRecordingV2Config build() {
                return new VideoRecordingV2Config(this.enable, this.sendFrames);
            }

            public VideoRecordingV2ConfigBuilder enable(boolean z10) {
                this.enable = z10;
                return this;
            }

            public VideoRecordingV2ConfigBuilder sendFrames(boolean z10) {
                this.sendFrames = z10;
                return this;
            }

            public String toString() {
                return "RemoteConfig.VideoRecordingV2Config.VideoRecordingV2ConfigBuilder(enable=" + this.enable + ", sendFrames=" + this.sendFrames + ")";
            }
        }

        VideoRecordingV2Config(boolean z10, boolean z11) {
            this.enable = z10;
            this.sendFrames = z11;
        }

        public static VideoRecordingV2ConfigBuilder builder() {
            return new VideoRecordingV2ConfigBuilder();
        }

        protected boolean canEqual(Object obj) {
            return obj instanceof VideoRecordingV2Config;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof VideoRecordingV2Config)) {
                return false;
            }
            VideoRecordingV2Config videoRecordingV2Config = (VideoRecordingV2Config) obj;
            return videoRecordingV2Config.canEqual(this) && isEnable() == videoRecordingV2Config.isEnable() && isSendFrames() == videoRecordingV2Config.isSendFrames();
        }

        public int hashCode() {
            return (((isEnable() ? 79 : 97) + 59) * 59) + (isSendFrames() ? 79 : 97);
        }

        public boolean isEnable() {
            return this.enable;
        }

        public boolean isSendFrames() {
            return this.sendFrames;
        }

        public void setEnable(boolean z10) {
            this.enable = z10;
        }

        public void setSendFrames(boolean z10) {
            this.sendFrames = z10;
        }

        public String toString() {
            return "RemoteConfig.VideoRecordingV2Config(enable=" + isEnable() + ", sendFrames=" + isSendFrames() + ")";
        }
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof RemoteConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RemoteConfig)) {
            return false;
        }
        RemoteConfig remoteConfig = (RemoteConfig) obj;
        if (!remoteConfig.canEqual(this) || isUseBranding() != remoteConfig.isUseBranding() || isShowSdkVersion() != remoteConfig.isShowSdkVersion() || isUseIpToGeo() != remoteConfig.isUseIpToGeo() || isUseCompression() != remoteConfig.isUseCompression() || isUseAnalytics() != remoteConfig.isUseAnalytics() || isUseSelfieVideoRecording() != remoteConfig.isUseSelfieVideoRecording() || isUseCameraX() != remoteConfig.isUseCameraX() || isEnableInjectionChecks() != remoteConfig.isEnableInjectionChecks() || isRetakeOnStaticVideo() != remoteConfig.isRetakeOnStaticVideo()) {
            return false;
        }
        MixpanelConfig mixpanelConfig = getMixpanelConfig();
        MixpanelConfig mixpanelConfig2 = remoteConfig.getMixpanelConfig();
        if (mixpanelConfig != null ? !mixpanelConfig.equals(mixpanelConfig2) : mixpanelConfig2 != null) {
            return false;
        }
        AnalyticsConfig analyticsConfig = getAnalyticsConfig();
        AnalyticsConfig analyticsConfig2 = remoteConfig.getAnalyticsConfig();
        if (analyticsConfig != null ? !analyticsConfig.equals(analyticsConfig2) : analyticsConfig2 != null) {
            return false;
        }
        VideoRecordingV2Config videoRecordingV2Config = getVideoRecordingV2Config();
        VideoRecordingV2Config videoRecordingV2Config2 = remoteConfig.getVideoRecordingV2Config();
        return videoRecordingV2Config != null ? videoRecordingV2Config.equals(videoRecordingV2Config2) : videoRecordingV2Config2 == null;
    }

    public AnalyticsConfig getAnalyticsConfig() {
        return this.analyticsConfig;
    }

    public MixpanelConfig getMixpanelConfig() {
        return this.mixpanelConfig;
    }

    public VideoRecordingV2Config getVideoRecordingV2Config() {
        return this.videoRecordingV2Config;
    }

    public int hashCode() {
        int i10 = (((((((((((((((((isUseBranding() ? 79 : 97) + 59) * 59) + (isShowSdkVersion() ? 79 : 97)) * 59) + (isUseIpToGeo() ? 79 : 97)) * 59) + (isUseCompression() ? 79 : 97)) * 59) + (isUseAnalytics() ? 79 : 97)) * 59) + (isUseSelfieVideoRecording() ? 79 : 97)) * 59) + (isUseCameraX() ? 79 : 97)) * 59) + (isEnableInjectionChecks() ? 79 : 97)) * 59) + (isRetakeOnStaticVideo() ? 79 : 97);
        MixpanelConfig mixpanelConfig = getMixpanelConfig();
        int hashCode = (i10 * 59) + (mixpanelConfig == null ? 43 : mixpanelConfig.hashCode());
        AnalyticsConfig analyticsConfig = getAnalyticsConfig();
        int hashCode2 = (hashCode * 59) + (analyticsConfig == null ? 43 : analyticsConfig.hashCode());
        VideoRecordingV2Config videoRecordingV2Config = getVideoRecordingV2Config();
        return (hashCode2 * 59) + (videoRecordingV2Config != null ? videoRecordingV2Config.hashCode() : 43);
    }

    public boolean isEnableInjectionChecks() {
        return this.enableInjectionChecks;
    }

    public boolean isRetakeOnStaticVideo() {
        return this.retakeOnStaticVideo;
    }

    public boolean isShowSdkVersion() {
        return this.showSdkVersion;
    }

    public boolean isUseAnalytics() {
        return this.useAnalytics;
    }

    public boolean isUseBranding() {
        return this.useBranding;
    }

    public boolean isUseCameraX() {
        return this.useCameraX;
    }

    public boolean isUseCompression() {
        return this.useCompression;
    }

    public boolean isUseIpToGeo() {
        return this.useIpToGeo;
    }

    public boolean isUseSelfieVideoRecording() {
        return this.useSelfieVideoRecording;
    }

    public void setAnalyticsConfig(AnalyticsConfig analyticsConfig) {
        this.analyticsConfig = analyticsConfig;
    }

    public void setEnableInjectionChecks(boolean z10) {
        this.enableInjectionChecks = z10;
    }

    public void setMixpanelConfig(MixpanelConfig mixpanelConfig) {
        this.mixpanelConfig = mixpanelConfig;
    }

    public void setRetakeOnStaticVideo(boolean z10) {
        this.retakeOnStaticVideo = z10;
    }

    public void setShowSdkVersion(boolean z10) {
        this.showSdkVersion = z10;
    }

    public void setUseAnalytics(boolean z10) {
        this.useAnalytics = z10;
    }

    public void setUseBranding(boolean z10) {
        this.useBranding = z10;
    }

    public void setUseCameraX(boolean z10) {
        this.useCameraX = z10;
    }

    public void setUseCompression(boolean z10) {
        this.useCompression = z10;
    }

    public void setUseIpToGeo(boolean z10) {
        this.useIpToGeo = z10;
    }

    public void setUseSelfieVideoRecording(boolean z10) {
        this.useSelfieVideoRecording = z10;
    }

    public void setVideoRecordingV2Config(VideoRecordingV2Config videoRecordingV2Config) {
        this.videoRecordingV2Config = videoRecordingV2Config;
    }

    public String toString() {
        return "RemoteConfig(useBranding=" + isUseBranding() + ", showSdkVersion=" + isShowSdkVersion() + ", mixpanelConfig=" + getMixpanelConfig() + ", useIpToGeo=" + isUseIpToGeo() + ", useCompression=" + isUseCompression() + ", useAnalytics=" + isUseAnalytics() + ", analyticsConfig=" + getAnalyticsConfig() + ", useSelfieVideoRecording=" + isUseSelfieVideoRecording() + ", videoRecordingV2Config=" + getVideoRecordingV2Config() + ", useCameraX=" + isUseCameraX() + ", enableInjectionChecks=" + isEnableInjectionChecks() + ", retakeOnStaticVideo=" + isRetakeOnStaticVideo() + ")";
    }
}
