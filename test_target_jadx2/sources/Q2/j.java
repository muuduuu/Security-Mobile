package Q2;

import com.chuckerteam.chucker.internal.data.entity.HttpHeader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.conscrypt.BuildConfig;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXParseException;
import xc.C5146G;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f8092a = new j();

    static final class a extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f8093a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10) {
            super(1);
            this.f8093a = z10;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(HttpHeader header) {
            Intrinsics.checkNotNullParameter(header, "header");
            if (!this.f8093a) {
                return header.getName() + ": " + header.getValue() + '\n';
            }
            return "<b> " + header.getName() + ": </b>" + header.getValue() + " <br />";
        }
    }

    static final class b extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f8094a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(String entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            List split$default = StringsKt.split$default(entry, new String[]{"="}, false, 0, 6, null);
            return ((String) split$default.get(0)) + ": " + ((Object) (split$default.size() > 1 ? URLDecoder.decode((String) split$default.get(1), "UTF-8") : BuildConfig.FLAVOR));
        }
    }

    private j() {
    }

    public final String a(long j10, boolean z10) {
        int i10 = z10 ? 1000 : 1024;
        if (j10 < i10) {
            return j10 + " B";
        }
        double d10 = j10;
        double d11 = i10;
        int log = (int) (Math.log(d10) / Math.log(d11));
        char charAt = (z10 ? "kMGTPE" : "KMGTPE").charAt(log - 1);
        String str = String.valueOf(charAt) + (z10 ? BuildConfig.FLAVOR : "i");
        C5146G c5146g = C5146G.f44966a;
        String format = String.format(Locale.US, "%.1f %sB", Arrays.copyOf(new Object[]{Double.valueOf(d10 / Math.pow(d11, log)), str}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
        return format;
    }

    public final String b(List list, boolean z10) {
        String l02;
        return (list == null || (l02 = CollectionsKt.l0(list, BuildConfig.FLAVOR, null, null, 0, null, new a(z10), 30, null)) == null) ? BuildConfig.FLAVOR : l02;
    }

    public final String c(String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        try {
            String s10 = m.f8102a.a().s(com.google.gson.m.c(json));
            Intrinsics.checkNotNullExpressionValue(s10, "{\n            val je = JsonParser.parseString(json)\n            JsonConverter.instance.toJson(je)\n        }");
            return s10;
        } catch (com.google.gson.l unused) {
            return json;
        }
    }

    public final String d(String form) {
        Intrinsics.checkNotNullParameter(form, "form");
        try {
            return StringsKt.Z(form) ? form : CollectionsKt.l0(StringsKt.split$default(form, new String[]{"&"}, false, 0, 6, null), "\n", null, null, 0, null, b.f8094a, 30, null);
        } catch (UnsupportedEncodingException | IllegalArgumentException unused) {
            return form;
        }
    }

    public final String e(String xml) {
        Intrinsics.checkNotNullParameter(xml, "xml");
        try {
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance()");
            newInstance.setExpandEntityReferences(false);
            DocumentBuilder newDocumentBuilder = newInstance.newDocumentBuilder();
            Intrinsics.checkNotNullExpressionValue(newDocumentBuilder, "documentFactory.newDocumentBuilder()");
            Charset defaultCharset = Charset.defaultCharset();
            Intrinsics.checkNotNullExpressionValue(defaultCharset, "defaultCharset()");
            byte[] bytes = xml.getBytes(defaultCharset);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            Document parse = newDocumentBuilder.parse(new InputSource(new ByteArrayInputStream(bytes)));
            Intrinsics.checkNotNullExpressionValue(parse, "documentBuilder.parse(inputSource)");
            DOMSource dOMSource = new DOMSource(parse);
            StringWriter stringWriter = new StringWriter();
            StreamResult streamResult = new StreamResult(stringWriter);
            TransformerFactory newInstance2 = TransformerFactory.newInstance();
            newInstance2.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
            Transformer newTransformer = newInstance2.newTransformer();
            newTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            newTransformer.setOutputProperty("indent", "yes");
            newTransformer.transform(dOMSource, streamResult);
            String stringWriter2 = stringWriter.toString();
            Intrinsics.checkNotNullExpressionValue(stringWriter2, "{\n            val documentFactory: DocumentBuilderFactory = DocumentBuilderFactory.newInstance()\n            // This flag is required for security reasons\n            documentFactory.isExpandEntityReferences = false\n\n            val documentBuilder: DocumentBuilder = documentFactory.newDocumentBuilder()\n            val inputSource = InputSource(ByteArrayInputStream(xml.toByteArray(Charset.defaultCharset())))\n            val document: Document = documentBuilder.parse(inputSource)\n\n            val domSource = DOMSource(document)\n            val writer = StringWriter()\n            val result = StreamResult(writer)\n\n            TransformerFactory.newInstance().apply {\n                setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true)\n            }.newTransformer().apply {\n                setOutputProperty(\"{http://xml.apache.org/xslt}indent-amount\", \"2\")\n                setOutputProperty(OutputKeys.INDENT, \"yes\")\n                transform(domSource, result)\n            }\n            writer.toString()\n        }");
            return stringWriter2;
        } catch (IOException | TransformerException | SAXParseException unused) {
            return xml;
        }
    }
}
