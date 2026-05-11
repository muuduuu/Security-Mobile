package co.hyperverge.hypersnapsdk.analytics.mixpanel.network;

import O8.c;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import java.io.Serializable;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
public class MixPanelEvent implements Serializable {

    @c(Keys.EVENT)
    private String eventName;

    @c("properties")
    private Map<String, Object> props;

    public MixPanelEvent(String str, Map<String, Object> map) {
        this.eventName = str;
        this.props = map;
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof MixPanelEvent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MixPanelEvent)) {
            return false;
        }
        MixPanelEvent mixPanelEvent = (MixPanelEvent) obj;
        if (!mixPanelEvent.canEqual(this)) {
            return false;
        }
        String eventName = getEventName();
        String eventName2 = mixPanelEvent.getEventName();
        if (eventName != null ? !eventName.equals(eventName2) : eventName2 != null) {
            return false;
        }
        Map<String, Object> props = getProps();
        Map<String, Object> props2 = mixPanelEvent.getProps();
        return props != null ? props.equals(props2) : props2 == null;
    }

    public String getEventName() {
        return this.eventName;
    }

    public Map<String, Object> getProps() {
        return this.props;
    }

    public int hashCode() {
        String eventName = getEventName();
        int hashCode = eventName == null ? 43 : eventName.hashCode();
        Map<String, Object> props = getProps();
        return ((hashCode + 59) * 59) + (props != null ? props.hashCode() : 43);
    }

    public void setEventName(String str) {
        this.eventName = str;
    }

    public void setProps(Map<String, Object> map) {
        this.props = map;
    }

    public String toString() {
        return "MixPanelEvent(eventName=" + getEventName() + ", props=" + getProps() + ")";
    }
}
