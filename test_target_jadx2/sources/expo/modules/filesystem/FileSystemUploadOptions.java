package expo.modules.filesystem;

import Ab.b;
import Ab.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u001e\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0011Jv\u0010\u001c\u001a\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0019J\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R.\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0011R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010+\u0012\u0004\b-\u0010*\u001a\u0004\b,\u0010\u0013R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010.\u0012\u0004\b0\u0010*\u001a\u0004\b/\u0010\u0015R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00101\u0012\u0004\b3\u0010*\u001a\u0004\b2\u0010\u0017R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00104\u0012\u0004\b6\u0010*\u001a\u0004\b5\u0010\u0019R\"\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00104\u0012\u0004\b8\u0010*\u001a\u0004\b7\u0010\u0019R.\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010'\u0012\u0004\b:\u0010*\u001a\u0004\b9\u0010\u0011¨\u0006;"}, d2 = {"Lexpo/modules/filesystem/FileSystemUploadOptions;", "LAb/c;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "headers", "Lexpo/modules/filesystem/HttpMethod;", "httpMethod", "Lexpo/modules/filesystem/SessionType;", "sessionType", "Lexpo/modules/filesystem/FileSystemUploadType;", "uploadType", "fieldName", "mimeType", "parameters", "<init>", "(Ljava/util/Map;Lexpo/modules/filesystem/HttpMethod;Lexpo/modules/filesystem/SessionType;Lexpo/modules/filesystem/FileSystemUploadType;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/util/Map;", "component2", "()Lexpo/modules/filesystem/HttpMethod;", "component3", "()Lexpo/modules/filesystem/SessionType;", "component4", "()Lexpo/modules/filesystem/FileSystemUploadType;", "component5", "()Ljava/lang/String;", "component6", "component7", "copy", "(Ljava/util/Map;Lexpo/modules/filesystem/HttpMethod;Lexpo/modules/filesystem/SessionType;Lexpo/modules/filesystem/FileSystemUploadType;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lexpo/modules/filesystem/FileSystemUploadOptions;", "toString", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getHeaders", "getHeaders$annotations", "()V", "Lexpo/modules/filesystem/HttpMethod;", "getHttpMethod", "getHttpMethod$annotations", "Lexpo/modules/filesystem/SessionType;", "getSessionType", "getSessionType$annotations", "Lexpo/modules/filesystem/FileSystemUploadType;", "getUploadType", "getUploadType$annotations", "Ljava/lang/String;", "getFieldName", "getFieldName$annotations", "getMimeType", "getMimeType$annotations", "getParameters", "getParameters$annotations", "expo-file-system_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FileSystemUploadOptions implements c {
    private final String fieldName;
    private final Map<String, String> headers;
    private final HttpMethod httpMethod;
    private final String mimeType;
    private final Map<String, String> parameters;
    private final SessionType sessionType;
    private final FileSystemUploadType uploadType;

    public FileSystemUploadOptions(Map<String, String> map, HttpMethod httpMethod, SessionType sessionType, FileSystemUploadType uploadType, String str, String str2, Map<String, String> map2) {
        Intrinsics.checkNotNullParameter(httpMethod, "httpMethod");
        Intrinsics.checkNotNullParameter(sessionType, "sessionType");
        Intrinsics.checkNotNullParameter(uploadType, "uploadType");
        this.headers = map;
        this.httpMethod = httpMethod;
        this.sessionType = sessionType;
        this.uploadType = uploadType;
        this.fieldName = str;
        this.mimeType = str2;
        this.parameters = map2;
    }

    public static /* synthetic */ FileSystemUploadOptions copy$default(FileSystemUploadOptions fileSystemUploadOptions, Map map, HttpMethod httpMethod, SessionType sessionType, FileSystemUploadType fileSystemUploadType, String str, String str2, Map map2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = fileSystemUploadOptions.headers;
        }
        if ((i10 & 2) != 0) {
            httpMethod = fileSystemUploadOptions.httpMethod;
        }
        HttpMethod httpMethod2 = httpMethod;
        if ((i10 & 4) != 0) {
            sessionType = fileSystemUploadOptions.sessionType;
        }
        SessionType sessionType2 = sessionType;
        if ((i10 & 8) != 0) {
            fileSystemUploadType = fileSystemUploadOptions.uploadType;
        }
        FileSystemUploadType fileSystemUploadType2 = fileSystemUploadType;
        if ((i10 & 16) != 0) {
            str = fileSystemUploadOptions.fieldName;
        }
        String str3 = str;
        if ((i10 & 32) != 0) {
            str2 = fileSystemUploadOptions.mimeType;
        }
        String str4 = str2;
        if ((i10 & 64) != 0) {
            map2 = fileSystemUploadOptions.parameters;
        }
        return fileSystemUploadOptions.copy(map, httpMethod2, sessionType2, fileSystemUploadType2, str3, str4, map2);
    }

    @b
    public static /* synthetic */ void getFieldName$annotations() {
    }

    @b
    public static /* synthetic */ void getHeaders$annotations() {
    }

    @b
    public static /* synthetic */ void getHttpMethod$annotations() {
    }

    @b
    public static /* synthetic */ void getMimeType$annotations() {
    }

    @b
    public static /* synthetic */ void getParameters$annotations() {
    }

    @b
    public static /* synthetic */ void getSessionType$annotations() {
    }

    @b
    public static /* synthetic */ void getUploadType$annotations() {
    }

    public final Map<String, String> component1() {
        return this.headers;
    }

    /* renamed from: component2, reason: from getter */
    public final HttpMethod getHttpMethod() {
        return this.httpMethod;
    }

    /* renamed from: component3, reason: from getter */
    public final SessionType getSessionType() {
        return this.sessionType;
    }

    /* renamed from: component4, reason: from getter */
    public final FileSystemUploadType getUploadType() {
        return this.uploadType;
    }

    /* renamed from: component5, reason: from getter */
    public final String getFieldName() {
        return this.fieldName;
    }

    /* renamed from: component6, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    public final Map<String, String> component7() {
        return this.parameters;
    }

    public final FileSystemUploadOptions copy(Map<String, String> headers, HttpMethod httpMethod, SessionType sessionType, FileSystemUploadType uploadType, String fieldName, String mimeType, Map<String, String> parameters) {
        Intrinsics.checkNotNullParameter(httpMethod, "httpMethod");
        Intrinsics.checkNotNullParameter(sessionType, "sessionType");
        Intrinsics.checkNotNullParameter(uploadType, "uploadType");
        return new FileSystemUploadOptions(headers, httpMethod, sessionType, uploadType, fieldName, mimeType, parameters);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileSystemUploadOptions)) {
            return false;
        }
        FileSystemUploadOptions fileSystemUploadOptions = (FileSystemUploadOptions) other;
        return Intrinsics.b(this.headers, fileSystemUploadOptions.headers) && this.httpMethod == fileSystemUploadOptions.httpMethod && this.sessionType == fileSystemUploadOptions.sessionType && this.uploadType == fileSystemUploadOptions.uploadType && Intrinsics.b(this.fieldName, fileSystemUploadOptions.fieldName) && Intrinsics.b(this.mimeType, fileSystemUploadOptions.mimeType) && Intrinsics.b(this.parameters, fileSystemUploadOptions.parameters);
    }

    public final String getFieldName() {
        return this.fieldName;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final HttpMethod getHttpMethod() {
        return this.httpMethod;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final Map<String, String> getParameters() {
        return this.parameters;
    }

    public final SessionType getSessionType() {
        return this.sessionType;
    }

    public final FileSystemUploadType getUploadType() {
        return this.uploadType;
    }

    public int hashCode() {
        Map<String, String> map = this.headers;
        int hashCode = (((((((map == null ? 0 : map.hashCode()) * 31) + this.httpMethod.hashCode()) * 31) + this.sessionType.hashCode()) * 31) + this.uploadType.hashCode()) * 31;
        String str = this.fieldName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.mimeType;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, String> map2 = this.parameters;
        return hashCode3 + (map2 != null ? map2.hashCode() : 0);
    }

    public String toString() {
        return "FileSystemUploadOptions(headers=" + this.headers + ", httpMethod=" + this.httpMethod + ", sessionType=" + this.sessionType + ", uploadType=" + this.uploadType + ", fieldName=" + this.fieldName + ", mimeType=" + this.mimeType + ", parameters=" + this.parameters + ")";
    }

    public /* synthetic */ FileSystemUploadOptions(Map map, HttpMethod httpMethod, SessionType sessionType, FileSystemUploadType fileSystemUploadType, String str, String str2, Map map2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i10 & 2) != 0 ? HttpMethod.POST : httpMethod, (i10 & 4) != 0 ? SessionType.BACKGROUND : sessionType, fileSystemUploadType, str, str2, map2);
    }
}
