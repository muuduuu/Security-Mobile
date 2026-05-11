package co.hyperverge.hypersnapsdk.data;

import O8.c;
import java.io.Serializable;

/* loaded from: classes.dex */
public class MixpanelEvents implements Serializable {

    @c("userSession")
    private boolean userSession = false;

    @c("instructionsScreenLaunched")
    private boolean instructionsScreenLaunched = false;

    @c("captureScreenLaunched")
    private boolean captureScreenLaunched = false;

    @c("captureScreenClosed")
    private boolean captureScreenClosed = false;

    @c("captureSuccessful")
    private boolean captureSuccessful = false;

    @c("captureFailed")
    private boolean captureFailed = true;

    @c("oldDocReviewScreenEvents")
    private boolean oldDocReviewScreenEvents = false;

    @c("apiCallMade")
    private boolean apiCallMade = false;

    @c("apiCallSuccessful")
    private boolean apiCallSuccessful = false;

    @c("apiCallFailed")
    private boolean apiCallFailed = false;

    @c("otherErrors")
    private boolean otherErrors = true;

    protected boolean canEqual(Object obj) {
        return obj instanceof MixpanelEvents;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MixpanelEvents)) {
            return false;
        }
        MixpanelEvents mixpanelEvents = (MixpanelEvents) obj;
        return mixpanelEvents.canEqual(this) && isUserSession() == mixpanelEvents.isUserSession() && isInstructionsScreenLaunched() == mixpanelEvents.isInstructionsScreenLaunched() && isCaptureScreenLaunched() == mixpanelEvents.isCaptureScreenLaunched() && isCaptureScreenClosed() == mixpanelEvents.isCaptureScreenClosed() && isCaptureSuccessful() == mixpanelEvents.isCaptureSuccessful() && isCaptureFailed() == mixpanelEvents.isCaptureFailed() && isOldDocReviewScreenEvents() == mixpanelEvents.isOldDocReviewScreenEvents() && isApiCallMade() == mixpanelEvents.isApiCallMade() && isApiCallSuccessful() == mixpanelEvents.isApiCallSuccessful() && isApiCallFailed() == mixpanelEvents.isApiCallFailed() && isOtherErrors() == mixpanelEvents.isOtherErrors();
    }

    public int hashCode() {
        return (((((((((((((((((((((isUserSession() ? 79 : 97) + 59) * 59) + (isInstructionsScreenLaunched() ? 79 : 97)) * 59) + (isCaptureScreenLaunched() ? 79 : 97)) * 59) + (isCaptureScreenClosed() ? 79 : 97)) * 59) + (isCaptureSuccessful() ? 79 : 97)) * 59) + (isCaptureFailed() ? 79 : 97)) * 59) + (isOldDocReviewScreenEvents() ? 79 : 97)) * 59) + (isApiCallMade() ? 79 : 97)) * 59) + (isApiCallSuccessful() ? 79 : 97)) * 59) + (isApiCallFailed() ? 79 : 97)) * 59) + (isOtherErrors() ? 79 : 97);
    }

    public boolean isApiCallFailed() {
        return this.apiCallFailed;
    }

    public boolean isApiCallMade() {
        return this.apiCallMade;
    }

    public boolean isApiCallSuccessful() {
        return this.apiCallSuccessful;
    }

    public boolean isCaptureFailed() {
        return this.captureFailed;
    }

    public boolean isCaptureScreenClosed() {
        return this.captureScreenClosed;
    }

    public boolean isCaptureScreenLaunched() {
        return this.captureScreenLaunched;
    }

    public boolean isCaptureSuccessful() {
        return this.captureSuccessful;
    }

    public boolean isInstructionsScreenLaunched() {
        return this.instructionsScreenLaunched;
    }

    public boolean isOldDocReviewScreenEvents() {
        return this.oldDocReviewScreenEvents;
    }

    public boolean isOtherErrors() {
        return this.otherErrors;
    }

    public boolean isUserSession() {
        return this.userSession;
    }

    public void setApiCallFailed(boolean z10) {
        this.apiCallFailed = z10;
    }

    public void setApiCallMade(boolean z10) {
        this.apiCallMade = z10;
    }

    public void setApiCallSuccessful(boolean z10) {
        this.apiCallSuccessful = z10;
    }

    public void setCaptureFailed(boolean z10) {
        this.captureFailed = z10;
    }

    public void setCaptureScreenClosed(boolean z10) {
        this.captureScreenClosed = z10;
    }

    public void setCaptureScreenLaunched(boolean z10) {
        this.captureScreenLaunched = z10;
    }

    public void setCaptureSuccessful(boolean z10) {
        this.captureSuccessful = z10;
    }

    public void setInstructionsScreenLaunched(boolean z10) {
        this.instructionsScreenLaunched = z10;
    }

    public void setOldDocReviewScreenEvents(boolean z10) {
        this.oldDocReviewScreenEvents = z10;
    }

    public void setOtherErrors(boolean z10) {
        this.otherErrors = z10;
    }

    public void setUserSession(boolean z10) {
        this.userSession = z10;
    }

    public String toString() {
        return "MixpanelEvents(userSession=" + isUserSession() + ", instructionsScreenLaunched=" + isInstructionsScreenLaunched() + ", captureScreenLaunched=" + isCaptureScreenLaunched() + ", captureScreenClosed=" + isCaptureScreenClosed() + ", captureSuccessful=" + isCaptureSuccessful() + ", captureFailed=" + isCaptureFailed() + ", oldDocReviewScreenEvents=" + isOldDocReviewScreenEvents() + ", apiCallMade=" + isApiCallMade() + ", apiCallSuccessful=" + isApiCallSuccessful() + ", apiCallFailed=" + isApiCallFailed() + ", otherErrors=" + isOtherErrors() + ")";
    }
}
