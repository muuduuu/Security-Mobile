package co.hyperverge.hypersnapsdk.data.remote;

import De.InterfaceC0818b;
import Fe.f;
import Fe.y;
import co.hyperverge.hypersnapsdk.data.DefaultRemoteConfig;
import co.hyperverge.hypersnapsdk.data.RemoteConfig;
import co.hyperverge.hypersnapsdk.data.models.FeatureConfigResponse;

/* loaded from: classes.dex */
public interface RemoteConfigApiInterface {
    @f
    InterfaceC0818b<DefaultRemoteConfig> getDefaultRemoteConfig(@y String str);

    @f
    InterfaceC0818b<FeatureConfigResponse> getFeatureRemoteConfig(@y String str);

    @f
    InterfaceC0818b<RemoteConfig> getRemoteConfig(@y String str);
}
