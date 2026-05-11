package co.hyperverge.hypersnapsdk.model;

import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public class GestureResponse extends BaseResponse {
    ResultResponse resultResponse;

    class ResultResponse {
        int conf;
        String match = BuildConfig.FLAVOR;

        ResultResponse() {
        }

        public int getConf() {
            return this.conf;
        }

        public String getMatch() {
            return this.match;
        }
    }

    public int getConf() {
        return this.resultResponse.getConf();
    }

    public boolean getMatch() {
        ResultResponse resultResponse = this.resultResponse;
        if (resultResponse != null) {
            return resultResponse.getMatch().equals("yes");
        }
        return false;
    }

    public ResultResponse getResultResponse() {
        return this.resultResponse;
    }
}
