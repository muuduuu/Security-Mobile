package Y1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* loaded from: classes.dex */
public class a implements d {

    /* renamed from: a, reason: collision with root package name */
    private final HttpURLConnection f11992a;

    public a(HttpURLConnection httpURLConnection) {
        this.f11992a = httpURLConnection;
    }

    private String a(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb2.append(readLine);
                    sb2.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb2.toString();
    }

    @Override // Y1.d
    public String S0() {
        return this.f11992a.getContentType();
    }

    @Override // Y1.d
    public String V0() {
        try {
            if (isSuccessful()) {
                return null;
            }
            return "Unable to fetch " + this.f11992a.getURL() + ". Failed with " + this.f11992a.getResponseCode() + "\n" + a(this.f11992a);
        } catch (IOException e10) {
            b2.f.d("get error failed ", e10);
            return e10.getMessage();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f11992a.disconnect();
    }

    @Override // Y1.d
    public InputStream d1() {
        return this.f11992a.getInputStream();
    }

    @Override // Y1.d
    public boolean isSuccessful() {
        try {
            return this.f11992a.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }
}
