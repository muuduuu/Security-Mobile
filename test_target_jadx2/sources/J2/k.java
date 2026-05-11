package J2;

import J2.b;
import J2.e;
import J2.g;
import android.graphics.Matrix;
import android.util.Log;
import android.util.Xml;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.conscrypt.BuildConfig;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
class k {

    /* renamed from: d, reason: collision with root package name */
    private int f4724d;

    /* renamed from: a, reason: collision with root package name */
    private J2.g f4721a = null;

    /* renamed from: b, reason: collision with root package name */
    private g.J f4722b = null;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4723c = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f4725e = false;

    /* renamed from: f, reason: collision with root package name */
    private h f4726f = null;

    /* renamed from: g, reason: collision with root package name */
    private StringBuilder f4727g = null;

    /* renamed from: h, reason: collision with root package name */
    private boolean f4728h = false;

    /* renamed from: i, reason: collision with root package name */
    private StringBuilder f4729i = null;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4730a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f4731b;

        static {
            int[] iArr = new int[g.values().length];
            f4731b = iArr;
            try {
                iArr[g.x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4731b[g.y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4731b[g.width.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4731b[g.height.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4731b[g.version.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4731b[g.href.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4731b[g.preserveAspectRatio.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4731b[g.d.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4731b[g.pathLength.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4731b[g.rx.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4731b[g.ry.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4731b[g.cx.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f4731b[g.cy.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f4731b[g.r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f4731b[g.x1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f4731b[g.y1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f4731b[g.x2.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f4731b[g.y2.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f4731b[g.dx.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f4731b[g.dy.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f4731b[g.requiredFeatures.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f4731b[g.requiredExtensions.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f4731b[g.systemLanguage.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f4731b[g.requiredFormats.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f4731b[g.requiredFonts.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f4731b[g.refX.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f4731b[g.refY.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f4731b[g.markerWidth.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f4731b[g.markerHeight.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f4731b[g.markerUnits.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f4731b[g.orient.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f4731b[g.gradientUnits.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f4731b[g.gradientTransform.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f4731b[g.spreadMethod.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f4731b[g.fx.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f4731b[g.fy.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f4731b[g.offset.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f4731b[g.clipPathUnits.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f4731b[g.startOffset.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f4731b[g.patternUnits.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f4731b[g.patternContentUnits.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f4731b[g.patternTransform.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f4731b[g.maskUnits.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f4731b[g.maskContentUnits.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f4731b[g.style.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f4731b[g.CLASS.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f4731b[g.fill.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f4731b[g.fill_rule.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f4731b[g.fill_opacity.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f4731b[g.stroke.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f4731b[g.stroke_opacity.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f4731b[g.stroke_width.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f4731b[g.stroke_linecap.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f4731b[g.stroke_linejoin.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f4731b[g.stroke_miterlimit.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                f4731b[g.stroke_dasharray.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                f4731b[g.stroke_dashoffset.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f4731b[g.opacity.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                f4731b[g.color.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                f4731b[g.font.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                f4731b[g.font_family.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                f4731b[g.font_size.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                f4731b[g.font_weight.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                f4731b[g.font_style.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                f4731b[g.text_decoration.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                f4731b[g.direction.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                f4731b[g.text_anchor.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                f4731b[g.overflow.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                f4731b[g.marker.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                f4731b[g.marker_start.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                f4731b[g.marker_mid.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                f4731b[g.marker_end.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                f4731b[g.display.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                f4731b[g.visibility.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                f4731b[g.stop_color.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                f4731b[g.stop_opacity.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                f4731b[g.clip.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                f4731b[g.clip_path.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                f4731b[g.clip_rule.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                f4731b[g.mask.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                f4731b[g.solid_color.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                f4731b[g.solid_opacity.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                f4731b[g.viewport_fill.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                f4731b[g.viewport_fill_opacity.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                f4731b[g.vector_effect.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                f4731b[g.image_rendering.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                f4731b[g.viewBox.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                f4731b[g.type.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                f4731b[g.media.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            int[] iArr2 = new int[h.values().length];
            f4730a = iArr2;
            try {
                iArr2[h.svg.ordinal()] = 1;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                f4730a[h.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                f4730a[h.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                f4730a[h.defs.ordinal()] = 4;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                f4730a[h.use.ordinal()] = 5;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                f4730a[h.path.ordinal()] = 6;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                f4730a[h.rect.ordinal()] = 7;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                f4730a[h.circle.ordinal()] = 8;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                f4730a[h.ellipse.ordinal()] = 9;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                f4730a[h.line.ordinal()] = 10;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                f4730a[h.polyline.ordinal()] = 11;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                f4730a[h.polygon.ordinal()] = 12;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                f4730a[h.text.ordinal()] = 13;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                f4730a[h.tspan.ordinal()] = 14;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                f4730a[h.tref.ordinal()] = 15;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                f4730a[h.SWITCH.ordinal()] = 16;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                f4730a[h.symbol.ordinal()] = 17;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                f4730a[h.marker.ordinal()] = 18;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                f4730a[h.linearGradient.ordinal()] = 19;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                f4730a[h.radialGradient.ordinal()] = 20;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                f4730a[h.stop.ordinal()] = 21;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                f4730a[h.title.ordinal()] = 22;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                f4730a[h.desc.ordinal()] = 23;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                f4730a[h.clipPath.ordinal()] = 24;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                f4730a[h.textPath.ordinal()] = 25;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                f4730a[h.pattern.ordinal()] = 26;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                f4730a[h.image.ordinal()] = 27;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                f4730a[h.view.ordinal()] = 28;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                f4730a[h.mask.ordinal()] = 29;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                f4730a[h.style.ordinal()] = 30;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                f4730a[h.solidColor.ordinal()] = 31;
            } catch (NoSuchFieldError unused120) {
            }
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final Map f4732a;

        static {
            HashMap hashMap = new HashMap(10);
            f4732a = hashMap;
            hashMap.put("none", e.a.none);
            hashMap.put("xMinYMin", e.a.xMinYMin);
            hashMap.put("xMidYMin", e.a.xMidYMin);
            hashMap.put("xMaxYMin", e.a.xMaxYMin);
            hashMap.put("xMinYMid", e.a.xMinYMid);
            hashMap.put("xMidYMid", e.a.xMidYMid);
            hashMap.put("xMaxYMid", e.a.xMaxYMid);
            hashMap.put("xMinYMax", e.a.xMinYMax);
            hashMap.put("xMidYMax", e.a.xMidYMax);
            hashMap.put("xMaxYMax", e.a.xMaxYMax);
        }

        static e.a a(String str) {
            return (e.a) f4732a.get(str);
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private static final Map f4733a;

        static {
            HashMap hashMap = new HashMap(47);
            f4733a = hashMap;
            hashMap.put("aliceblue", -984833);
            hashMap.put("antiquewhite", -332841);
            hashMap.put("aqua", -16711681);
            hashMap.put("aquamarine", -8388652);
            hashMap.put("azure", -983041);
            hashMap.put("beige", -657956);
            hashMap.put("bisque", -6972);
            hashMap.put("black", -16777216);
            hashMap.put("blanchedalmond", -5171);
            hashMap.put("blue", -16776961);
            hashMap.put("blueviolet", -7722014);
            hashMap.put("brown", -5952982);
            hashMap.put("burlywood", -2180985);
            hashMap.put("cadetblue", -10510688);
            hashMap.put("chartreuse", -8388864);
            hashMap.put("chocolate", -2987746);
            hashMap.put("coral", -32944);
            hashMap.put("cornflowerblue", -10185235);
            hashMap.put("cornsilk", -1828);
            hashMap.put("crimson", -2354116);
            hashMap.put("cyan", -16711681);
            hashMap.put("darkblue", -16777077);
            hashMap.put("darkcyan", -16741493);
            hashMap.put("darkgoldenrod", -4684277);
            hashMap.put("darkgray", -5658199);
            hashMap.put("darkgreen", -16751616);
            hashMap.put("darkgrey", -5658199);
            hashMap.put("darkkhaki", -4343957);
            hashMap.put("darkmagenta", -7667573);
            hashMap.put("darkolivegreen", -11179217);
            hashMap.put("darkorange", -29696);
            hashMap.put("darkorchid", -6737204);
            hashMap.put("darkred", -7667712);
            hashMap.put("darksalmon", -1468806);
            hashMap.put("darkseagreen", -7357297);
            hashMap.put("darkslateblue", -12042869);
            hashMap.put("darkslategray", -13676721);
            hashMap.put("darkslategrey", -13676721);
            hashMap.put("darkturquoise", -16724271);
            hashMap.put("darkviolet", -7077677);
            hashMap.put("deeppink", -60269);
            hashMap.put("deepskyblue", -16728065);
            hashMap.put("dimgray", -9868951);
            hashMap.put("dimgrey", -9868951);
            hashMap.put("dodgerblue", -14774017);
            hashMap.put("firebrick", -5103070);
            hashMap.put("floralwhite", -1296);
            hashMap.put("forestgreen", -14513374);
            hashMap.put("fuchsia", -65281);
            hashMap.put("gainsboro", -2302756);
            hashMap.put("ghostwhite", -460545);
            hashMap.put("gold", -10496);
            hashMap.put("goldenrod", -2448096);
            hashMap.put("gray", -8355712);
            hashMap.put("green", -16744448);
            hashMap.put("greenyellow", -5374161);
            hashMap.put("grey", -8355712);
            hashMap.put("honeydew", -983056);
            hashMap.put("hotpink", -38476);
            hashMap.put("indianred", -3318692);
            hashMap.put("indigo", -11861886);
            hashMap.put("ivory", -16);
            hashMap.put("khaki", -989556);
            hashMap.put("lavender", -1644806);
            hashMap.put("lavenderblush", -3851);
            hashMap.put("lawngreen", -8586240);
            hashMap.put("lemonchiffon", -1331);
            hashMap.put("lightblue", -5383962);
            hashMap.put("lightcoral", -1015680);
            hashMap.put("lightcyan", -2031617);
            hashMap.put("lightgoldenrodyellow", -329006);
            hashMap.put("lightgray", -2894893);
            hashMap.put("lightgreen", -7278960);
            hashMap.put("lightgrey", -2894893);
            hashMap.put("lightpink", -18751);
            hashMap.put("lightsalmon", -24454);
            hashMap.put("lightseagreen", -14634326);
            hashMap.put("lightskyblue", -7876870);
            hashMap.put("lightslategray", -8943463);
            hashMap.put("lightslategrey", -8943463);
            hashMap.put("lightsteelblue", -5192482);
            hashMap.put("lightyellow", -32);
            hashMap.put("lime", -16711936);
            hashMap.put("limegreen", -13447886);
            hashMap.put("linen", -331546);
            hashMap.put("magenta", -65281);
            hashMap.put("maroon", -8388608);
            hashMap.put("mediumaquamarine", -10039894);
            hashMap.put("mediumblue", -16777011);
            hashMap.put("mediumorchid", -4565549);
            hashMap.put("mediumpurple", -7114533);
            hashMap.put("mediumseagreen", -12799119);
            hashMap.put("mediumslateblue", -8689426);
            hashMap.put("mediumspringgreen", -16713062);
            hashMap.put("mediumturquoise", -12004916);
            hashMap.put("mediumvioletred", -3730043);
            hashMap.put("midnightblue", -15132304);
            hashMap.put("mintcream", -655366);
            hashMap.put("mistyrose", -6943);
            hashMap.put("moccasin", -6987);
            hashMap.put("navajowhite", -8531);
            hashMap.put("navy", -16777088);
            hashMap.put("oldlace", -133658);
            hashMap.put("olive", -8355840);
            hashMap.put("olivedrab", -9728477);
            hashMap.put("orange", -23296);
            hashMap.put("orangered", -47872);
            hashMap.put("orchid", -2461482);
            hashMap.put("palegoldenrod", -1120086);
            hashMap.put("palegreen", -6751336);
            hashMap.put("paleturquoise", -5247250);
            hashMap.put("palevioletred", -2396013);
            hashMap.put("papayawhip", -4139);
            hashMap.put("peachpuff", -9543);
            hashMap.put("peru", -3308225);
            hashMap.put("pink", -16181);
            hashMap.put("plum", -2252579);
            hashMap.put("powderblue", -5185306);
            hashMap.put("purple", -8388480);
            hashMap.put("rebeccapurple", -10079335);
            hashMap.put("red", -65536);
            hashMap.put("rosybrown", -4419697);
            hashMap.put("royalblue", -12490271);
            hashMap.put("saddlebrown", -7650029);
            hashMap.put("salmon", -360334);
            hashMap.put("sandybrown", -744352);
            hashMap.put("seagreen", -13726889);
            hashMap.put("seashell", -2578);
            hashMap.put("sienna", -6270419);
            hashMap.put("silver", -4144960);
            hashMap.put("skyblue", -7876885);
            hashMap.put("slateblue", -9807155);
            hashMap.put("slategray", -9404272);
            hashMap.put("slategrey", -9404272);
            hashMap.put("snow", -1286);
            hashMap.put("springgreen", -16711809);
            hashMap.put("steelblue", -12156236);
            hashMap.put("tan", -2968436);
            hashMap.put("teal", -16744320);
            hashMap.put("thistle", -2572328);
            hashMap.put("tomato", -40121);
            hashMap.put("turquoise", -12525360);
            hashMap.put("violet", -1146130);
            hashMap.put("wheat", -663885);
            hashMap.put("white", -1);
            hashMap.put("whitesmoke", -657931);
            hashMap.put("yellow", -256);
            hashMap.put("yellowgreen", -6632142);
            hashMap.put("transparent", 0);
        }

        static Integer a(String str) {
            return (Integer) f4733a.get(str);
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        private static final Map f4734a;

        static {
            HashMap hashMap = new HashMap(9);
            f4734a = hashMap;
            g.d0 d0Var = g.d0.pt;
            hashMap.put("xx-small", new g.C0860p(0.694f, d0Var));
            hashMap.put("x-small", new g.C0860p(0.833f, d0Var));
            hashMap.put("small", new g.C0860p(10.0f, d0Var));
            hashMap.put("medium", new g.C0860p(12.0f, d0Var));
            hashMap.put("large", new g.C0860p(14.4f, d0Var));
            hashMap.put("x-large", new g.C0860p(17.3f, d0Var));
            hashMap.put("xx-large", new g.C0860p(20.7f, d0Var));
            g.d0 d0Var2 = g.d0.percent;
            hashMap.put("smaller", new g.C0860p(83.33f, d0Var2));
            hashMap.put("larger", new g.C0860p(120.0f, d0Var2));
        }

        static g.C0860p a(String str) {
            return (g.C0860p) f4734a.get(str);
        }
    }

    private static class e {

        /* renamed from: a, reason: collision with root package name */
        private static final Map f4735a;

        static {
            HashMap hashMap = new HashMap(13);
            f4735a = hashMap;
            hashMap.put("normal", 400);
            hashMap.put("bold", 700);
            hashMap.put("bolder", 1);
            hashMap.put("lighter", -1);
            hashMap.put("100", 100);
            hashMap.put("200", 200);
            hashMap.put("300", 300);
            hashMap.put("400", 400);
            hashMap.put("500", 500);
            hashMap.put("600", 600);
            hashMap.put("700", 700);
            hashMap.put("800", 800);
            hashMap.put("900", 900);
        }

        static Integer a(String str) {
            return (Integer) f4735a.get(str);
        }
    }

    private class f extends DefaultHandler2 {
        private f() {
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i10, int i11) {
            k.this.c1(new String(cArr, i10, i11));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endDocument() {
            k.this.o();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) {
            k.this.p(str, str2, str3);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void processingInstruction(String str, String str2) {
            k.this.r(str, k.this.x0(new i(str2)));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startDocument() {
            k.this.W0();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) {
            k.this.X0(str, str2, str3, attributes);
        }

        /* synthetic */ f(k kVar, a aVar) {
            this();
        }
    }

    private enum g {
        CLASS,
        clip,
        clip_path,
        clipPathUnits,
        clip_rule,
        color,
        cx,
        cy,
        direction,
        dx,
        dy,
        fx,
        fy,
        d,
        display,
        fill,
        fill_rule,
        fill_opacity,
        font,
        font_family,
        font_size,
        font_weight,
        font_style,
        gradientTransform,
        gradientUnits,
        height,
        href,
        image_rendering,
        marker,
        marker_start,
        marker_mid,
        marker_end,
        markerHeight,
        markerUnits,
        markerWidth,
        mask,
        maskContentUnits,
        maskUnits,
        media,
        offset,
        opacity,
        orient,
        overflow,
        pathLength,
        patternContentUnits,
        patternTransform,
        patternUnits,
        points,
        preserveAspectRatio,
        r,
        refX,
        refY,
        requiredFeatures,
        requiredExtensions,
        requiredFormats,
        requiredFonts,
        rx,
        ry,
        solid_color,
        solid_opacity,
        spreadMethod,
        startOffset,
        stop_color,
        stop_opacity,
        stroke,
        stroke_dasharray,
        stroke_dashoffset,
        stroke_linecap,
        stroke_linejoin,
        stroke_miterlimit,
        stroke_opacity,
        stroke_width,
        style,
        systemLanguage,
        text_anchor,
        text_decoration,
        transform,
        type,
        vector_effect,
        version,
        viewBox,
        width,
        x,
        y,
        x1,
        y1,
        x2,
        y2,
        viewport_fill,
        viewport_fill_opacity,
        visibility,
        UNSUPPORTED;

        private static final Map<String, g> cache = new HashMap();

        static {
            for (g gVar : values()) {
                if (gVar == CLASS) {
                    cache.put("class", gVar);
                } else if (gVar != UNSUPPORTED) {
                    cache.put(gVar.name().replace('_', '-'), gVar);
                }
            }
        }

        public static g fromString(String str) {
            g gVar = cache.get(str);
            return gVar != null ? gVar : UNSUPPORTED;
        }
    }

    private enum h {
        svg,
        a,
        circle,
        clipPath,
        defs,
        desc,
        ellipse,
        g,
        image,
        line,
        linearGradient,
        marker,
        mask,
        path,
        pattern,
        polygon,
        polyline,
        radialGradient,
        rect,
        solidColor,
        stop,
        style,
        SWITCH,
        symbol,
        text,
        textPath,
        title,
        tref,
        tspan,
        use,
        view,
        UNSUPPORTED;

        private static final Map<String, h> cache = new HashMap();

        static {
            for (h hVar : values()) {
                if (hVar == SWITCH) {
                    cache.put("switch", hVar);
                } else if (hVar != UNSUPPORTED) {
                    cache.put(hVar.name(), hVar);
                }
            }
        }

        public static h fromString(String str) {
            h hVar = cache.get(str);
            return hVar != null ? hVar : UNSUPPORTED;
        }
    }

    static class i {

        /* renamed from: a, reason: collision with root package name */
        String f4747a;

        /* renamed from: c, reason: collision with root package name */
        int f4749c;

        /* renamed from: b, reason: collision with root package name */
        int f4748b = 0;

        /* renamed from: d, reason: collision with root package name */
        private J2.d f4750d = new J2.d();

        i(String str) {
            this.f4749c = 0;
            String trim = str.trim();
            this.f4747a = trim;
            this.f4749c = trim.length();
        }

        void A() {
            while (true) {
                int i10 = this.f4748b;
                if (i10 >= this.f4749c || !k(this.f4747a.charAt(i10))) {
                    return;
                } else {
                    this.f4748b++;
                }
            }
        }

        int a() {
            int i10 = this.f4748b;
            int i11 = this.f4749c;
            if (i10 == i11) {
                return -1;
            }
            int i12 = i10 + 1;
            this.f4748b = i12;
            if (i12 < i11) {
                return this.f4747a.charAt(i12);
            }
            return -1;
        }

        String b() {
            int i10 = this.f4748b;
            while (!h() && !k(this.f4747a.charAt(this.f4748b))) {
                this.f4748b++;
            }
            String substring = this.f4747a.substring(i10, this.f4748b);
            this.f4748b = i10;
            return substring;
        }

        Boolean c(Object obj) {
            if (obj == null) {
                return null;
            }
            z();
            return m();
        }

        float d(float f10) {
            if (Float.isNaN(f10)) {
                return Float.NaN;
            }
            z();
            return n();
        }

        float e(Boolean bool) {
            if (bool == null) {
                return Float.NaN;
            }
            z();
            return n();
        }

        boolean f(char c10) {
            int i10 = this.f4748b;
            boolean z10 = i10 < this.f4749c && this.f4747a.charAt(i10) == c10;
            if (z10) {
                this.f4748b++;
            }
            return z10;
        }

        boolean g(String str) {
            int length = str.length();
            int i10 = this.f4748b;
            boolean z10 = i10 <= this.f4749c - length && this.f4747a.substring(i10, i10 + length).equals(str);
            if (z10) {
                this.f4748b += length;
            }
            return z10;
        }

        boolean h() {
            return this.f4748b == this.f4749c;
        }

        boolean i() {
            int i10 = this.f4748b;
            if (i10 == this.f4749c) {
                return false;
            }
            char charAt = this.f4747a.charAt(i10);
            return (charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z');
        }

        boolean j(int i10) {
            return i10 == 10 || i10 == 13;
        }

        boolean k(int i10) {
            return i10 == 32 || i10 == 10 || i10 == 13 || i10 == 9;
        }

        Integer l() {
            int i10 = this.f4748b;
            if (i10 == this.f4749c) {
                return null;
            }
            String str = this.f4747a;
            this.f4748b = i10 + 1;
            return Integer.valueOf(str.charAt(i10));
        }

        Boolean m() {
            int i10 = this.f4748b;
            if (i10 == this.f4749c) {
                return null;
            }
            char charAt = this.f4747a.charAt(i10);
            if (charAt != '0' && charAt != '1') {
                return null;
            }
            this.f4748b++;
            return Boolean.valueOf(charAt == '1');
        }

        float n() {
            float b10 = this.f4750d.b(this.f4747a, this.f4748b, this.f4749c);
            if (!Float.isNaN(b10)) {
                this.f4748b = this.f4750d.a();
            }
            return b10;
        }

        String o() {
            if (h()) {
                return null;
            }
            int i10 = this.f4748b;
            int charAt = this.f4747a.charAt(i10);
            while (true) {
                if ((charAt < 97 || charAt > 122) && (charAt < 65 || charAt > 90)) {
                    break;
                }
                charAt = a();
            }
            int i11 = this.f4748b;
            while (k(charAt)) {
                charAt = a();
            }
            if (charAt == 40) {
                this.f4748b++;
                return this.f4747a.substring(i10, i11);
            }
            this.f4748b = i10;
            return null;
        }

        g.C0860p p() {
            float n10 = n();
            if (Float.isNaN(n10)) {
                return null;
            }
            g.d0 v10 = v();
            return v10 == null ? new g.C0860p(n10, g.d0.px) : new g.C0860p(n10, v10);
        }

        String q() {
            if (h()) {
                return null;
            }
            int i10 = this.f4748b;
            char charAt = this.f4747a.charAt(i10);
            if (charAt != '\'' && charAt != '\"') {
                return null;
            }
            int a10 = a();
            while (a10 != -1 && a10 != charAt) {
                a10 = a();
            }
            if (a10 == -1) {
                this.f4748b = i10;
                return null;
            }
            int i11 = this.f4748b;
            this.f4748b = i11 + 1;
            return this.f4747a.substring(i10 + 1, i11);
        }

        String r() {
            return t(' ', false);
        }

        String s(char c10) {
            return t(c10, false);
        }

        String t(char c10, boolean z10) {
            if (h()) {
                return null;
            }
            char charAt = this.f4747a.charAt(this.f4748b);
            if ((!z10 && k(charAt)) || charAt == c10) {
                return null;
            }
            int i10 = this.f4748b;
            int a10 = a();
            while (a10 != -1 && a10 != c10 && (z10 || !k(a10))) {
                a10 = a();
            }
            return this.f4747a.substring(i10, this.f4748b);
        }

        String u(char c10) {
            return t(c10, true);
        }

        g.d0 v() {
            if (h()) {
                return null;
            }
            if (this.f4747a.charAt(this.f4748b) == '%') {
                this.f4748b++;
                return g.d0.percent;
            }
            int i10 = this.f4748b;
            if (i10 > this.f4749c - 2) {
                return null;
            }
            try {
                g.d0 valueOf = g.d0.valueOf(this.f4747a.substring(i10, i10 + 2).toLowerCase(Locale.US));
                this.f4748b += 2;
                return valueOf;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        String w() {
            if (h()) {
                return null;
            }
            int i10 = this.f4748b;
            char charAt = this.f4747a.charAt(i10);
            if ((charAt < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z')) {
                this.f4748b = i10;
                return null;
            }
            int a10 = a();
            while (true) {
                if ((a10 < 65 || a10 > 90) && (a10 < 97 || a10 > 122)) {
                    break;
                }
                a10 = a();
            }
            return this.f4747a.substring(i10, this.f4748b);
        }

        float x() {
            z();
            float b10 = this.f4750d.b(this.f4747a, this.f4748b, this.f4749c);
            if (!Float.isNaN(b10)) {
                this.f4748b = this.f4750d.a();
            }
            return b10;
        }

        String y() {
            if (h()) {
                return null;
            }
            int i10 = this.f4748b;
            this.f4748b = this.f4749c;
            return this.f4747a.substring(i10);
        }

        boolean z() {
            A();
            int i10 = this.f4748b;
            if (i10 == this.f4749c || this.f4747a.charAt(i10) != ',') {
                return false;
            }
            this.f4748b++;
            A();
            return true;
        }
    }

    private class j implements Attributes {

        /* renamed from: a, reason: collision with root package name */
        private XmlPullParser f4751a;

        public j(XmlPullParser xmlPullParser) {
            this.f4751a = xmlPullParser;
        }

        @Override // org.xml.sax.Attributes
        public int getIndex(String str, String str2) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public int getLength() {
            return this.f4751a.getAttributeCount();
        }

        @Override // org.xml.sax.Attributes
        public String getLocalName(int i10) {
            return this.f4751a.getAttributeName(i10);
        }

        @Override // org.xml.sax.Attributes
        public String getQName(int i10) {
            String attributeName = this.f4751a.getAttributeName(i10);
            if (this.f4751a.getAttributePrefix(i10) == null) {
                return attributeName;
            }
            return this.f4751a.getAttributePrefix(i10) + ':' + attributeName;
        }

        @Override // org.xml.sax.Attributes
        public String getType(int i10) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getURI(int i10) {
            return this.f4751a.getAttributeNamespace(i10);
        }

        @Override // org.xml.sax.Attributes
        public String getValue(int i10) {
            return this.f4751a.getAttributeValue(i10);
        }

        @Override // org.xml.sax.Attributes
        public int getIndex(String str) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public String getType(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getValue(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getType(String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getValue(String str) {
            return null;
        }
    }

    k() {
    }

    private void A(g.C0849d c0849d, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String trim = attributes.getValue(i10).trim();
            switch (a.f4731b[g.fromString(attributes.getLocalName(i10)).ordinal()]) {
                case 12:
                    c0849d.f4599o = o0(trim);
                    break;
                case 13:
                    c0849d.f4600p = o0(trim);
                    break;
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    g.C0860p o02 = o0(trim);
                    c0849d.f4601q = o02;
                    if (o02.l()) {
                        throw new J2.j("Invalid <circle> element. r cannot be negative");
                    }
                    break;
            }
        }
    }

    private static Set A0(String str) {
        i iVar = new i(str);
        HashSet hashSet = new HashSet();
        while (!iVar.h()) {
            hashSet.add(iVar.r());
            iVar.A();
        }
        return hashSet;
    }

    private void B(g.C0850e c0850e, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String trim = attributes.getValue(i10).trim();
            if (a.f4731b[g.fromString(attributes.getLocalName(i10)).ordinal()] == 38) {
                if ("objectBoundingBox".equals(trim)) {
                    c0850e.f4603p = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(trim)) {
                        throw new J2.j("Invalid value for attribute clipPathUnits");
                    }
                    c0850e.f4603p = Boolean.TRUE;
                }
            }
        }
    }

    private static g.C0860p[] B0(String str) {
        g.C0860p p10;
        i iVar = new i(str);
        iVar.A();
        if (iVar.h() || (p10 = iVar.p()) == null || p10.l()) {
            return null;
        }
        float a10 = p10.a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(p10);
        while (!iVar.h()) {
            iVar.z();
            g.C0860p p11 = iVar.p();
            if (p11 == null || p11.l()) {
                return null;
            }
            arrayList.add(p11);
            a10 += p11.a();
        }
        if (a10 == 0.0f) {
            return null;
        }
        return (g.C0860p[]) arrayList.toArray(new g.C0860p[arrayList.size()]);
    }

    private void C(g.G g10, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String trim = attributes.getValue(i10).trim();
            switch (a.f4731b[g.fromString(attributes.getLocalName(i10)).ordinal()]) {
                case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                    g10.g(z0(trim));
                    break;
                case HVError.FACE_DETECTION_ERROR /* 22 */:
                    g10.j(trim);
                    break;
                case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                    g10.l(F0(trim));
                    break;
                case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                    g10.c(A0(trim));
                    break;
                case HVError.LOW_STORAGE_ERROR /* 25 */:
                    List i02 = i0(trim);
                    g10.e(i02 != null ? new HashSet(i02) : new HashSet(0));
                    break;
            }
        }
    }

    private static g.E.c C0(String str) {
        if ("butt".equals(str)) {
            return g.E.c.Butt;
        }
        if ("round".equals(str)) {
            return g.E.c.Round;
        }
        if ("square".equals(str)) {
            return g.E.c.Square;
        }
        return null;
    }

    private void D(g.L l10, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String qName = attributes.getQName(i10);
            if (qName.equals("id") || qName.equals("xml:id")) {
                l10.f4559c = attributes.getValue(i10).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String trim = attributes.getValue(i10).trim();
                if ("default".equals(trim)) {
                    l10.f4560d = Boolean.FALSE;
                    return;
                } else {
                    if ("preserve".equals(trim)) {
                        l10.f4560d = Boolean.TRUE;
                        return;
                    }
                    throw new J2.j("Invalid value for \"xml:space\" attribute: " + trim);
                }
            }
        }
    }

    private static g.E.d D0(String str) {
        if ("miter".equals(str)) {
            return g.E.d.Miter;
        }
        if ("round".equals(str)) {
            return g.E.d.Round;
        }
        if ("bevel".equals(str)) {
            return g.E.d.Bevel;
        }
        return null;
    }

    private void E(g.C0853i c0853i, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String trim = attributes.getValue(i10).trim();
            switch (a.f4731b[g.fromString(attributes.getLocalName(i10)).ordinal()]) {
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    g.C0860p o02 = o0(trim);
                    c0853i.f4615q = o02;
                    if (o02.l()) {
                        throw new J2.j("Invalid <ellipse> element. rx cannot be negative");
                    }
                    break;
                case 11:
                    g.C0860p o03 = o0(trim);
                    c0853i.f4616r = o03;
                    if (o03.l()) {
                        throw new J2.j("Invalid <ellipse> element. ry cannot be negative");
                    }
                    break;
                case 12:
                    c0853i.f4613o = o0(trim);
                    break;
                case 13:
                    c0853i.f4614p = o0(trim);
                    break;
            }
        }
    }

    private static void E0(g.L l10, String str) {
        i iVar = new i(str.replaceAll("/\\*.*?\\*/", BuildConfig.FLAVOR));
        while (true) {
            String s10 = iVar.s(':');
            iVar.A();
            if (!iVar.f(':')) {
                return;
            }
            iVar.A();
            String u10 = iVar.u(';');
            if (u10 == null) {
                return;
            }
            iVar.A();
            if (iVar.h() || iVar.f(';')) {
                if (l10.f4562f == null) {
                    l10.f4562f = new g.E();
                }
                S0(l10.f4562f, s10, u10);
                iVar.A();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void F(g.AbstractC0854j abstractC0854j, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String trim = attributes.getValue(i10).trim();
            int i11 = a.f4731b[g.fromString(attributes.getLocalName(i10)).ordinal()];
            if (i11 != 6) {
                switch (i11) {
                    case 32:
                        if (!"objectBoundingBox".equals(trim)) {
                            if (!"userSpaceOnUse".equals(trim)) {
                                throw new J2.j("Invalid value for attribute gradientUnits");
                            }
                            abstractC0854j.f4618i = Boolean.TRUE;
                            break;
                        } else {
                            abstractC0854j.f4618i = Boolean.FALSE;
                            break;
                        }
                    case HVError.GPS_ACCESS_DENIED /* 33 */:
                        abstractC0854j.f4619j = J0(trim);
                        break;
                    case 34:
                        try {
                            abstractC0854j.f4620k = g.EnumC0855k.valueOf(trim);
                            break;
                        } catch (IllegalArgumentException unused) {
                            throw new J2.j("Invalid spreadMethod attribute. \"" + trim + "\" is not a valid value.");
                        }
                }
            } else if (BuildConfig.FLAVOR.equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10))) {
                abstractC0854j.f4621l = trim;
            }
        }
    }

    private static Set F0(String str) {
        i iVar = new i(str);
        HashSet hashSet = new HashSet();
        while (!iVar.h()) {
            String r10 = iVar.r();
            int indexOf = r10.indexOf(45);
            if (indexOf != -1) {
                r10 = r10.substring(0, indexOf);
            }
            hashSet.add(new Locale(r10, BuildConfig.FLAVOR, BuildConfig.FLAVOR).getLanguage());
            iVar.A();
        }
        return hashSet;
    }

    private void G(g.C0859o c0859o, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String trim = attributes.getValue(i10).trim();
            int i11 = a.f4731b[g.fromString(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                c0859o.f4625q = o0(trim);
            } else if (i11 == 2) {
                c0859o.f4626r = o0(trim);
            } else if (i11 == 3) {
                g.C0860p o02 = o0(trim);
                c0859o.f4627s = o02;
                if (o02.l()) {
                    throw new J2.j("Invalid <use> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                g.C0860p o03 = o0(trim);
                c0859o.f4628t = o03;
                if (o03.l()) {
                    throw new J2.j("Invalid <use> element. height cannot be negative");
                }
            } else if (i11 != 6) {
                if (i11 == 7) {
                    w0(c0859o, trim);
                }
            } else if (BuildConfig.FLAVOR.equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10))) {
                c0859o.f4624p = trim;
            }
        }
    }

    private static g.E.f G0(String str) {
        str.hashCode();
        switch (str) {
            case "middle":
                return g.E.f.Middle;
            case "end":
                return g.E.f.End;
            case "start":
                return g.E.f.Start;
            default:
                return null;
        }
    }

    private void H(g.C0861q c0861q, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String trim = attributes.getValue(i10).trim();
            switch (a.f4731b[g.fromString(attributes.getLocalName(i10)).ordinal()]) {
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    c0861q.f4632o = o0(trim);
                    break;
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    c0861q.f4633p = o0(trim);
                    break;
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    c0861q.f4634q = o0(trim);
                    break;
                case 18:
                    c0861q.f4635r = o0(trim);
                    break;
            }
        }
    }

    private static g.E.EnumC0092g H0(String str) {
        str.hashCode();
        switch (str) {
            case "line-through":
                return g.E.EnumC0092g.LineThrough;
            case "underline":
                return g.E.EnumC0092g.Underline;
            case "none":
                return g.E.EnumC0092g.None;
            case "blink":
                return g.E.EnumC0092g.Blink;
            case "overline":
                return g.E.EnumC0092g.Overline;
            default:
                return null;
        }
    }

    private void I(g.M m10, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String trim = attributes.getValue(i10).trim();
            switch (a.f4731b[g.fromString(attributes.getLocalName(i10)).ordinal()]) {
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    m10.f4564m = o0(trim);
                    break;
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    m10.f4565n = o0(trim);
                    break;
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    m10.f4566o = o0(trim);
                    break;
                case 18:
                    m10.f4567p = o0(trim);
                    break;
            }
        }
    }

    private static g.E.h I0(String str) {
        str.hashCode();
        if (str.equals("ltr")) {
            return g.E.h.LTR;
        }
        if (str.equals("rtl")) {
            return g.E.h.RTL;
        }
        return null;
    }

    private void J(g.C0862r c0862r, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String trim = attributes.getValue(i10).trim();
            switch (a.f4731b[g.fromString(attributes.getLocalName(i10)).ordinal()]) {
                case 26:
                    c0862r.f4637r = o0(trim);
                    break;
                case 27:
                    c0862r.f4638s = o0(trim);
                    break;
                case 28:
                    g.C0860p o02 = o0(trim);
                    c0862r.f4639t = o02;
                    if (o02.l()) {
                        throw new J2.j("Invalid <marker> element. markerWidth cannot be negative");
                    }
                    break;
                case 29:
                    g.C0860p o03 = o0(trim);
                    c0862r.f4640u = o03;
                    if (o03.l()) {
                        throw new J2.j("Invalid <marker> element. markerHeight cannot be negative");
                    }
                    break;
                case 30:
                    if (!"strokeWidth".equals(trim)) {
                        if (!"userSpaceOnUse".equals(trim)) {
                            throw new J2.j("Invalid value for attribute markerUnits");
                        }
                        c0862r.f4636q = true;
                        break;
                    } else {
                        c0862r.f4636q = false;
                        break;
                    }
                case HVError.INSTRUCTION_ERROR /* 31 */:
                    if ("auto".equals(trim)) {
                        c0862r.f4641v = Float.valueOf(Float.NaN);
                        break;
                    } else {
                        c0862r.f4641v = Float.valueOf(f0(trim));
                        break;
                    }
            }
        }
    }

    private Matrix J0(String str) {
        Matrix matrix = new Matrix();
        i iVar = new i(str);
        iVar.A();
        while (!iVar.h()) {
            String o10 = iVar.o();
            if (o10 == null) {
                throw new J2.j("Bad transform function encountered in transform list: " + str);
            }
            switch (o10) {
                case "matrix":
                    iVar.A();
                    float n10 = iVar.n();
                    iVar.z();
                    float n11 = iVar.n();
                    iVar.z();
                    float n12 = iVar.n();
                    iVar.z();
                    float n13 = iVar.n();
                    iVar.z();
                    float n14 = iVar.n();
                    iVar.z();
                    float n15 = iVar.n();
                    iVar.A();
                    if (!Float.isNaN(n15) && iVar.f(')')) {
                        Matrix matrix2 = new Matrix();
                        matrix2.setValues(new float[]{n10, n12, n14, n11, n13, n15, 0.0f, 0.0f, 1.0f});
                        matrix.preConcat(matrix2);
                        break;
                    } else {
                        throw new J2.j("Invalid transform list: " + str);
                    }
                    break;
                case "rotate":
                    iVar.A();
                    float n16 = iVar.n();
                    float x10 = iVar.x();
                    float x11 = iVar.x();
                    iVar.A();
                    if (Float.isNaN(n16) || !iVar.f(')')) {
                        throw new J2.j("Invalid transform list: " + str);
                    }
                    if (Float.isNaN(x10)) {
                        matrix.preRotate(n16);
                        break;
                    } else if (!Float.isNaN(x11)) {
                        matrix.preRotate(n16, x10, x11);
                        break;
                    } else {
                        throw new J2.j("Invalid transform list: " + str);
                    }
                case "scale":
                    iVar.A();
                    float n17 = iVar.n();
                    float x12 = iVar.x();
                    iVar.A();
                    if (!Float.isNaN(n17) && iVar.f(')')) {
                        if (!Float.isNaN(x12)) {
                            matrix.preScale(n17, x12);
                            break;
                        } else {
                            matrix.preScale(n17, n17);
                            break;
                        }
                    } else {
                        throw new J2.j("Invalid transform list: " + str);
                    }
                    break;
                case "skewX":
                    iVar.A();
                    float n18 = iVar.n();
                    iVar.A();
                    if (!Float.isNaN(n18) && iVar.f(')')) {
                        matrix.preSkew((float) Math.tan(Math.toRadians(n18)), 0.0f);
                        break;
                    } else {
                        throw new J2.j("Invalid transform list: " + str);
                    }
                    break;
                case "skewY":
                    iVar.A();
                    float n19 = iVar.n();
                    iVar.A();
                    if (!Float.isNaN(n19) && iVar.f(')')) {
                        matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(n19)));
                        break;
                    } else {
                        throw new J2.j("Invalid transform list: " + str);
                    }
                case "translate":
                    iVar.A();
                    float n20 = iVar.n();
                    float x13 = iVar.x();
                    iVar.A();
                    if (!Float.isNaN(n20) && iVar.f(')')) {
                        if (!Float.isNaN(x13)) {
                            matrix.preTranslate(n20, x13);
                            break;
                        } else {
                            matrix.preTranslate(n20, 0.0f);
                            break;
                        }
                    } else {
                        throw new J2.j("Invalid transform list: " + str);
                    }
                    break;
                default:
                    throw new J2.j("Invalid transform list fn: " + o10 + ")");
            }
            if (iVar.h()) {
                return matrix;
            }
            iVar.z();
        }
        return matrix;
    }

    private void K(g.C0863s c0863s, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String trim = attributes.getValue(i10).trim();
            int i11 = a.f4731b[g.fromString(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                c0863s.f4644q = o0(trim);
            } else if (i11 == 2) {
                c0863s.f4645r = o0(trim);
            } else if (i11 == 3) {
                g.C0860p o02 = o0(trim);
                c0863s.f4646s = o02;
                if (o02.l()) {
                    throw new J2.j("Invalid <mask> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                g.C0860p o03 = o0(trim);
                c0863s.f4647t = o03;
                if (o03.l()) {
                    throw new J2.j("Invalid <mask> element. height cannot be negative");
                }
            } else if (i11 != 43) {
                if (i11 != 44) {
                    continue;
                } else if ("objectBoundingBox".equals(trim)) {
                    c0863s.f4643p = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(trim)) {
                        throw new J2.j("Invalid value for attribute maskContentUnits");
                    }
                    c0863s.f4643p = Boolean.TRUE;
                }
            } else if ("objectBoundingBox".equals(trim)) {
                c0863s.f4642o = Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(trim)) {
                    throw new J2.j("Invalid value for attribute maskUnits");
                }
                c0863s.f4642o = Boolean.TRUE;
            }
        }
    }

    private void K0(InputStream inputStream) {
        Log.d("SVGParser", "Falling back to SAX parser");
        try {
            SAXParserFactory newInstance = SAXParserFactory.newInstance();
            newInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            newInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = newInstance.newSAXParser().getXMLReader();
            f fVar = new f(this, null);
            xMLReader.setContentHandler(fVar);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", fVar);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e10) {
            throw new J2.j("Stream error", e10);
        } catch (ParserConfigurationException e11) {
            throw new J2.j("XML parser problem", e11);
        } catch (SAXException e12) {
            throw new J2.j("SVG parse error", e12);
        }
    }

    private void L(g.C0866v c0866v, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String trim = attributes.getValue(i10).trim();
            int i11 = a.f4731b[g.fromString(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 8) {
                c0866v.f4650o = u0(trim);
            } else if (i11 != 9) {
                continue;
            } else {
                Float valueOf = Float.valueOf(f0(trim));
                c0866v.f4651p = valueOf;
                if (valueOf.floatValue() < 0.0f) {
                    throw new J2.j("Invalid <path> element. pathLength cannot be negative");
                }
            }
        }
    }

    private void L0(InputStream inputStream, boolean z10) {
        try {
            try {
                XmlPullParser newPullParser = Xml.newPullParser();
                j jVar = new j(newPullParser);
                newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                newPullParser.setInput(inputStream, null);
                for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.nextToken()) {
                    if (eventType == 0) {
                        W0();
                    } else if (eventType == 8) {
                        Log.d("SVGParser", "PROC INSTR: " + newPullParser.getText());
                        i iVar = new i(newPullParser.getText());
                        r(iVar.r(), x0(iVar));
                    } else if (eventType != 10) {
                        if (eventType == 2) {
                            String name = newPullParser.getName();
                            if (newPullParser.getPrefix() != null) {
                                name = newPullParser.getPrefix() + ':' + name;
                            }
                            X0(newPullParser.getNamespace(), newPullParser.getName(), name, jVar);
                        } else if (eventType == 3) {
                            String name2 = newPullParser.getName();
                            if (newPullParser.getPrefix() != null) {
                                name2 = newPullParser.getPrefix() + ':' + name2;
                            }
                            p(newPullParser.getNamespace(), newPullParser.getName(), name2);
                        } else if (eventType == 4) {
                            int[] iArr = new int[2];
                            e1(newPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                        } else if (eventType == 5) {
                            c1(newPullParser.getText());
                        }
                    } else if (z10 && this.f4721a.m() == null && newPullParser.getText().contains("<!ENTITY ")) {
                        try {
                            Log.d("SVGParser", "Switching to SAX parser to process entities");
                            inputStream.reset();
                            K0(inputStream);
                            return;
                        } catch (IOException unused) {
                            Log.w("SVGParser", "Detected internal entity definitions, but could not parse them.");
                            return;
                        }
                    }
                }
                o();
            } catch (IOException e10) {
                throw new J2.j("Stream error", e10);
            }
        } catch (XmlPullParserException e11) {
            throw new J2.j("XML parser problem", e11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cf, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void M(g.C0869y c0869y, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String trim = attributes.getValue(i10).trim();
            int i11 = a.f4731b[g.fromString(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                c0869y.f4659t = o0(trim);
            } else if (i11 == 2) {
                c0869y.f4660u = o0(trim);
            } else if (i11 == 3) {
                g.C0860p o02 = o0(trim);
                c0869y.f4661v = o02;
                if (o02.l()) {
                    throw new J2.j("Invalid <pattern> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                g.C0860p o03 = o0(trim);
                c0869y.f4662w = o03;
                if (o03.l()) {
                    throw new J2.j("Invalid <pattern> element. height cannot be negative");
                }
            } else if (i11 != 6) {
                switch (i11) {
                    case RequestError.NETWORK_FAILURE /* 40 */:
                        if (!"objectBoundingBox".equals(trim)) {
                            if (!"userSpaceOnUse".equals(trim)) {
                                throw new J2.j("Invalid value for attribute patternUnits");
                            }
                            c0869y.f4656q = Boolean.TRUE;
                            break;
                        } else {
                            c0869y.f4656q = Boolean.FALSE;
                            break;
                        }
                    case RequestError.NO_DEV_KEY /* 41 */:
                        if (!"objectBoundingBox".equals(trim)) {
                            if (!"userSpaceOnUse".equals(trim)) {
                                throw new J2.j("Invalid value for attribute patternContentUnits");
                            }
                            c0869y.f4657r = Boolean.TRUE;
                            break;
                        } else {
                            c0869y.f4657r = Boolean.FALSE;
                            break;
                        }
                    case HVError.CONSENT_DENIED /* 42 */:
                        c0869y.f4658s = J0(trim);
                        break;
                }
            } else if (BuildConfig.FLAVOR.equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10))) {
                c0869y.f4663x = trim;
            }
        }
    }

    private static g.E.i M0(String str) {
        str.hashCode();
        if (str.equals("none")) {
            return g.E.i.None;
        }
        if (str.equals("non-scaling-stroke")) {
            return g.E.i.NonScalingStroke;
        }
        return null;
    }

    private void N(g.C0870z c0870z, Attributes attributes, String str) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            if (g.fromString(attributes.getLocalName(i10)) == g.points) {
                i iVar = new i(attributes.getValue(i10));
                ArrayList arrayList = new ArrayList();
                iVar.A();
                while (!iVar.h()) {
                    float n10 = iVar.n();
                    if (Float.isNaN(n10)) {
                        throw new J2.j("Invalid <" + str + "> points attribute. Non-coordinate content found in list.");
                    }
                    iVar.z();
                    float n11 = iVar.n();
                    if (Float.isNaN(n11)) {
                        throw new J2.j("Invalid <" + str + "> points attribute. There should be an even number of coordinates.");
                    }
                    iVar.z();
                    arrayList.add(Float.valueOf(n10));
                    arrayList.add(Float.valueOf(n11));
                }
                c0870z.f4664o = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    c0870z.f4664o[i11] = ((Float) it.next()).floatValue();
                    i11++;
                }
            }
        }
    }

    private static g.C0847b N0(String str) {
        i iVar = new i(str);
        iVar.A();
        float n10 = iVar.n();
        iVar.z();
        float n11 = iVar.n();
        iVar.z();
        float n12 = iVar.n();
        iVar.z();
        float n13 = iVar.n();
        if (Float.isNaN(n10) || Float.isNaN(n11) || Float.isNaN(n12) || Float.isNaN(n13)) {
            throw new J2.j("Invalid viewBox definition - should have four numbers");
        }
        if (n12 < 0.0f) {
            throw new J2.j("Invalid viewBox. width cannot be negative");
        }
        if (n13 >= 0.0f) {
            return new g.C0847b(n10, n11, n12, n13);
        }
        throw new J2.j("Invalid viewBox. height cannot be negative");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void O(g.Q q10, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String trim = attributes.getValue(i10).trim();
            int i11 = a.f4731b[g.fromString(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 35) {
                q10.f4574p = o0(trim);
            } else if (i11 != 36) {
                switch (i11) {
                    case 12:
                        q10.f4571m = o0(trim);
                        break;
                    case 13:
                        q10.f4572n = o0(trim);
                        break;
                    case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                        g.C0860p o02 = o0(trim);
                        q10.f4573o = o02;
                        if (o02.l()) {
                            throw new J2.j("Invalid <radialGradient> element. r cannot be negative");
                        }
                        break;
                }
            } else {
                q10.f4575q = o0(trim);
            }
        }
    }

    private void O0(Attributes attributes) {
        l("<path>", new Object[0]);
        if (this.f4722b == null) {
            throw new J2.j("Invalid document. Root element must be <svg>");
        }
        g.C0866v c0866v = new g.C0866v();
        c0866v.f4568a = this.f4721a;
        c0866v.f4569b = this.f4722b;
        D(c0866v, attributes);
        S(c0866v, attributes);
        W(c0866v, attributes);
        C(c0866v, attributes);
        L(c0866v, attributes);
        this.f4722b.h(c0866v);
    }

    private void P(g.B b10, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String trim = attributes.getValue(i10).trim();
            int i11 = a.f4731b[g.fromString(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                b10.f4496o = o0(trim);
            } else if (i11 == 2) {
                b10.f4497p = o0(trim);
            } else if (i11 == 3) {
                g.C0860p o02 = o0(trim);
                b10.f4498q = o02;
                if (o02.l()) {
                    throw new J2.j("Invalid <rect> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                g.C0860p o03 = o0(trim);
                b10.f4499r = o03;
                if (o03.l()) {
                    throw new J2.j("Invalid <rect> element. height cannot be negative");
                }
            } else if (i11 == 10) {
                g.C0860p o04 = o0(trim);
                b10.f4500s = o04;
                if (o04.l()) {
                    throw new J2.j("Invalid <rect> element. rx cannot be negative");
                }
            } else if (i11 != 11) {
                continue;
            } else {
                g.C0860p o05 = o0(trim);
                b10.f4501t = o05;
                if (o05.l()) {
                    throw new J2.j("Invalid <rect> element. ry cannot be negative");
                }
            }
        }
    }

    private void P0(Attributes attributes) {
        l("<pattern>", new Object[0]);
        if (this.f4722b == null) {
            throw new J2.j("Invalid document. Root element must be <svg>");
        }
        g.C0869y c0869y = new g.C0869y();
        c0869y.f4568a = this.f4721a;
        c0869y.f4569b = this.f4722b;
        D(c0869y, attributes);
        S(c0869y, attributes);
        C(c0869y, attributes);
        Y(c0869y, attributes);
        M(c0869y, attributes);
        this.f4722b.h(c0869y);
        this.f4722b = c0869y;
    }

    private void Q(g.F f10, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String trim = attributes.getValue(i10).trim();
            int i11 = a.f4731b[g.fromString(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                f10.f4542q = o0(trim);
            } else if (i11 == 2) {
                f10.f4543r = o0(trim);
            } else if (i11 == 3) {
                g.C0860p o02 = o0(trim);
                f10.f4544s = o02;
                if (o02.l()) {
                    throw new J2.j("Invalid <svg> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                g.C0860p o03 = o0(trim);
                f10.f4545t = o03;
                if (o03.l()) {
                    throw new J2.j("Invalid <svg> element. height cannot be negative");
                }
            } else if (i11 == 5) {
                f10.f4546u = trim;
            }
        }
    }

    private void Q0(Attributes attributes) {
        l("<polygon>", new Object[0]);
        if (this.f4722b == null) {
            throw new J2.j("Invalid document. Root element must be <svg>");
        }
        g.C0870z a10 = new g.A();
        a10.f4568a = this.f4721a;
        a10.f4569b = this.f4722b;
        D(a10, attributes);
        S(a10, attributes);
        W(a10, attributes);
        C(a10, attributes);
        N(a10, attributes, "polygon");
        this.f4722b.h(a10);
    }

    private void R(g.D d10, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String trim = attributes.getValue(i10).trim();
            if (a.f4731b[g.fromString(attributes.getLocalName(i10)).ordinal()] == 37) {
                d10.f4502h = n0(trim);
            }
        }
    }

    private void R0(Attributes attributes) {
        l("<polyline>", new Object[0]);
        if (this.f4722b == null) {
            throw new J2.j("Invalid document. Root element must be <svg>");
        }
        g.C0870z c0870z = new g.C0870z();
        c0870z.f4568a = this.f4721a;
        c0870z.f4569b = this.f4722b;
        D(c0870z, attributes);
        S(c0870z, attributes);
        W(c0870z, attributes);
        C(c0870z, attributes);
        N(c0870z, attributes, "polyline");
        this.f4722b.h(c0870z);
    }

    private void S(g.L l10, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String trim = attributes.getValue(i10).trim();
            if (trim.length() != 0) {
                int i11 = a.f4731b[g.fromString(attributes.getLocalName(i10)).ordinal()];
                if (i11 == 45) {
                    E0(l10, trim);
                } else if (i11 != 46) {
                    if (l10.f4561e == null) {
                        l10.f4561e = new g.E();
                    }
                    S0(l10.f4561e, attributes.getLocalName(i10), attributes.getValue(i10).trim());
                } else {
                    l10.f4563g = J2.b.f(trim);
                }
            }
        }
    }

    static void S0(g.E e10, String str, String str2) {
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        try {
            switch (a.f4731b[g.fromString(str).ordinal()]) {
                case 47:
                    g.O t02 = t0(str2);
                    e10.f4517b = t02;
                    if (t02 != null) {
                        e10.f4516a |= 1;
                        return;
                    }
                    return;
                case 48:
                    g.E.a e02 = e0(str2);
                    e10.f4518c = e02;
                    if (e02 != null) {
                        e10.f4516a |= 2;
                        return;
                    }
                    return;
                case 49:
                    Float r02 = r0(str2);
                    e10.f4519d = r02;
                    if (r02 != null) {
                        e10.f4516a |= 4;
                        return;
                    }
                    return;
                case 50:
                    g.O t03 = t0(str2);
                    e10.f4520e = t03;
                    if (t03 != null) {
                        e10.f4516a |= 8;
                        return;
                    }
                    return;
                case 51:
                    Float r03 = r0(str2);
                    e10.f4521f = r03;
                    if (r03 != null) {
                        e10.f4516a |= 16;
                        return;
                    }
                    return;
                case 52:
                    e10.f4522g = o0(str2);
                    e10.f4516a |= 32;
                    break;
                case 53:
                    g.E.c C02 = C0(str2);
                    e10.f4523h = C02;
                    if (C02 != null) {
                        e10.f4516a |= 64;
                        return;
                    }
                    return;
                case 54:
                    g.E.d D02 = D0(str2);
                    e10.f4524i = D02;
                    if (D02 != null) {
                        e10.f4516a |= 128;
                        return;
                    }
                    return;
                case 55:
                    e10.f4525j = Float.valueOf(f0(str2));
                    e10.f4516a |= 256;
                    break;
                case 56:
                    if ("none".equals(str2)) {
                        e10.f4526k = null;
                        e10.f4516a |= 512;
                        return;
                    }
                    g.C0860p[] B02 = B0(str2);
                    e10.f4526k = B02;
                    if (B02 != null) {
                        e10.f4516a |= 512;
                        return;
                    }
                    return;
                case 57:
                    e10.f4527l = o0(str2);
                    e10.f4516a |= 1024;
                    break;
                case 58:
                    e10.f4528m = r0(str2);
                    e10.f4516a |= 2048;
                    return;
                case 59:
                    e10.f4529n = b0(str2);
                    e10.f4516a |= 4096;
                    break;
                case HVError.DETECTOR_NOT_AVAILABLE_ERROR /* 60 */:
                    h0(e10, str2);
                    return;
                case 61:
                    List i02 = i0(str2);
                    e10.f4530o = i02;
                    if (i02 != null) {
                        e10.f4516a |= 8192;
                        return;
                    }
                    return;
                case 62:
                    g.C0860p j02 = j0(str2);
                    e10.f4531p = j02;
                    if (j02 != null) {
                        e10.f4516a |= 16384;
                        return;
                    }
                    return;
                case 63:
                    Integer l02 = l0(str2);
                    e10.f4532q = l02;
                    if (l02 != null) {
                        e10.f4516a |= 32768;
                        return;
                    }
                    return;
                case 64:
                    g.E.b k02 = k0(str2);
                    e10.f4533r = k02;
                    if (k02 != null) {
                        e10.f4516a |= 65536;
                        return;
                    }
                    return;
                case 65:
                    g.E.EnumC0092g H02 = H0(str2);
                    e10.f4534s = H02;
                    if (H02 != null) {
                        e10.f4516a |= 131072;
                        return;
                    }
                    return;
                case 66:
                    g.E.h I02 = I0(str2);
                    e10.f4535t = I02;
                    if (I02 != null) {
                        e10.f4516a |= 68719476736L;
                        return;
                    }
                    return;
                case 67:
                    g.E.f G02 = G0(str2);
                    e10.f4536u = G02;
                    if (G02 != null) {
                        e10.f4516a |= 262144;
                        return;
                    }
                    return;
                case 68:
                    Boolean s02 = s0(str2);
                    e10.f4537v = s02;
                    if (s02 != null) {
                        e10.f4516a |= 524288;
                        return;
                    }
                    return;
                case 69:
                    String m02 = m0(str2, str);
                    e10.f4539x = m02;
                    e10.f4540y = m02;
                    e10.f4541z = m02;
                    e10.f4516a |= 14680064;
                    return;
                case 70:
                    e10.f4539x = m0(str2, str);
                    e10.f4516a |= 2097152;
                    return;
                case 71:
                    e10.f4540y = m0(str2, str);
                    e10.f4516a |= 4194304;
                    return;
                case 72:
                    e10.f4541z = m0(str2, str);
                    e10.f4516a |= 8388608;
                    return;
                case 73:
                    if (str2.indexOf(124) < 0) {
                        if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains('|' + str2 + '|')) {
                            e10.f4503A = Boolean.valueOf(!str2.equals("none"));
                            e10.f4516a |= 16777216;
                            return;
                        }
                        return;
                    }
                    return;
                case 74:
                    if (str2.indexOf(124) < 0) {
                        if ("|visible|hidden|collapse|".contains('|' + str2 + '|')) {
                            e10.f4504B = Boolean.valueOf(str2.equals("visible"));
                            e10.f4516a |= 33554432;
                            return;
                        }
                        return;
                    }
                    return;
                case 75:
                    if (str2.equals("currentColor")) {
                        e10.f4505C = g.C0093g.a();
                    } else {
                        try {
                            e10.f4505C = b0(str2);
                        } catch (J2.j e11) {
                            Log.w("SVGParser", e11.getMessage());
                            return;
                        }
                    }
                    e10.f4516a |= 67108864;
                    return;
                case com.swmansion.reanimated.BuildConfig.REACT_NATIVE_MINOR_VERSION /* 76 */:
                    e10.f4506D = r0(str2);
                    e10.f4516a |= 134217728;
                    return;
                case 77:
                    g.C0848c a02 = a0(str2);
                    e10.f4538w = a02;
                    if (a02 != null) {
                        e10.f4516a |= 1048576;
                        return;
                    }
                    return;
                case 78:
                    e10.f4507E = m0(str2, str);
                    e10.f4516a |= 268435456;
                    return;
                case 79:
                    e10.f4508F = e0(str2);
                    e10.f4516a |= 536870912;
                    return;
                case 80:
                    e10.f4509G = m0(str2, str);
                    e10.f4516a |= 1073741824;
                    return;
                case 81:
                    if (str2.equals("currentColor")) {
                        e10.f4510H = g.C0093g.a();
                    } else {
                        try {
                            e10.f4510H = b0(str2);
                        } catch (J2.j e12) {
                            Log.w("SVGParser", e12.getMessage());
                            return;
                        }
                    }
                    e10.f4516a |= 2147483648L;
                    return;
                case 82:
                    e10.f4511I = r0(str2);
                    e10.f4516a |= 4294967296L;
                    return;
                case 83:
                    if (str2.equals("currentColor")) {
                        e10.f4512J = g.C0093g.a();
                    } else {
                        try {
                            e10.f4512J = b0(str2);
                        } catch (J2.j e13) {
                            Log.w("SVGParser", e13.getMessage());
                            return;
                        }
                    }
                    e10.f4516a |= 8589934592L;
                    return;
                case 84:
                    e10.f4513K = r0(str2);
                    e10.f4516a |= 17179869184L;
                    return;
                case 85:
                    g.E.i M02 = M0(str2);
                    e10.f4514X = M02;
                    if (M02 != null) {
                        e10.f4516a |= 34359738368L;
                        return;
                    }
                    return;
                case 86:
                    g.E.e y02 = y0(str2);
                    e10.f4515Y = y02;
                    if (y02 != null) {
                        e10.f4516a |= 137438953472L;
                        return;
                    }
                    return;
                default:
                    return;
            }
        } catch (J2.j unused) {
        }
    }

    private void T(g.U u10, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String trim = attributes.getValue(i10).trim();
            if (a.f4731b[g.fromString(attributes.getLocalName(i10)).ordinal()] == 6 && (BuildConfig.FLAVOR.equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10)))) {
                u10.f4577o = trim;
            }
        }
    }

    private void T0(Attributes attributes) {
        l("<radialGradient>", new Object[0]);
        if (this.f4722b == null) {
            throw new J2.j("Invalid document. Root element must be <svg>");
        }
        g.Q q10 = new g.Q();
        q10.f4568a = this.f4721a;
        q10.f4569b = this.f4722b;
        D(q10, attributes);
        S(q10, attributes);
        F(q10, attributes);
        O(q10, attributes);
        this.f4722b.h(q10);
        this.f4722b = q10;
    }

    private void U(g.Z z10, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String trim = attributes.getValue(i10).trim();
            int i11 = a.f4731b[g.fromString(attributes.getLocalName(i10)).ordinal()];
            if (i11 != 6) {
                if (i11 == 39) {
                    z10.f4582p = o0(trim);
                }
            } else if (BuildConfig.FLAVOR.equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10))) {
                z10.f4581o = trim;
            }
        }
    }

    private void U0(Attributes attributes) {
        l("<rect>", new Object[0]);
        if (this.f4722b == null) {
            throw new J2.j("Invalid document. Root element must be <svg>");
        }
        g.B b10 = new g.B();
        b10.f4568a = this.f4721a;
        b10.f4569b = this.f4722b;
        D(b10, attributes);
        S(b10, attributes);
        W(b10, attributes);
        C(b10, attributes);
        P(b10, attributes);
        this.f4722b.h(b10);
    }

    private void V(g.a0 a0Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String trim = attributes.getValue(i10).trim();
            int i11 = a.f4731b[g.fromString(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                a0Var.f4585o = p0(trim);
            } else if (i11 == 2) {
                a0Var.f4586p = p0(trim);
            } else if (i11 == 19) {
                a0Var.f4587q = p0(trim);
            } else if (i11 == 20) {
                a0Var.f4588r = p0(trim);
            }
        }
    }

    private void V0(Attributes attributes) {
        l("<solidColor>", new Object[0]);
        if (this.f4722b == null) {
            throw new J2.j("Invalid document. Root element must be <svg>");
        }
        g.C c10 = new g.C();
        c10.f4568a = this.f4721a;
        c10.f4569b = this.f4722b;
        D(c10, attributes);
        S(c10, attributes);
        this.f4722b.h(c10);
        this.f4722b = c10;
    }

    private void W(g.InterfaceC0858n interfaceC0858n, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            if (g.fromString(attributes.getLocalName(i10)) == g.transform) {
                interfaceC0858n.k(J0(attributes.getValue(i10)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W0() {
        this.f4721a = new J2.g();
    }

    private void X(g.e0 e0Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String trim = attributes.getValue(i10).trim();
            int i11 = a.f4731b[g.fromString(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                e0Var.f4605q = o0(trim);
            } else if (i11 == 2) {
                e0Var.f4606r = o0(trim);
            } else if (i11 == 3) {
                g.C0860p o02 = o0(trim);
                e0Var.f4607s = o02;
                if (o02.l()) {
                    throw new J2.j("Invalid <use> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                g.C0860p o03 = o0(trim);
                e0Var.f4608t = o03;
                if (o03.l()) {
                    throw new J2.j("Invalid <use> element. height cannot be negative");
                }
            } else if (i11 == 6 && (BuildConfig.FLAVOR.equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10)))) {
                e0Var.f4604p = trim;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X0(String str, String str2, String str3, Attributes attributes) {
        if (this.f4723c) {
            this.f4724d++;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || BuildConfig.FLAVOR.equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            h fromString = h.fromString(str2);
            switch (a.f4730a[fromString.ordinal()]) {
                case 1:
                    a1(attributes);
                    break;
                case 2:
                case 3:
                    q(attributes);
                    break;
                case 4:
                    m(attributes);
                    break;
                case 5:
                    i1(attributes);
                    break;
                case 6:
                    O0(attributes);
                    break;
                case 7:
                    U0(attributes);
                    break;
                case 8:
                    i(attributes);
                    break;
                case 9:
                    n(attributes);
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    v(attributes);
                    break;
                case 11:
                    R0(attributes);
                    break;
                case 12:
                    Q0(attributes);
                    break;
                case 13:
                    d1(attributes);
                    break;
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    h1(attributes);
                    break;
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    g1(attributes);
                    break;
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    k1(attributes);
                    break;
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    b1(attributes);
                    break;
                case 18:
                    x(attributes);
                    break;
                case 19:
                    w(attributes);
                    break;
                case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                    T0(attributes);
                    break;
                case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                    Y0(attributes);
                    break;
                case HVError.FACE_DETECTION_ERROR /* 22 */:
                case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                    this.f4725e = true;
                    this.f4726f = fromString;
                    break;
                case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                    k(attributes);
                    break;
                case HVError.LOW_STORAGE_ERROR /* 25 */:
                    f1(attributes);
                    break;
                case 26:
                    P0(attributes);
                    break;
                case 27:
                    u(attributes);
                    break;
                case 28:
                    j1(attributes);
                    break;
                case 29:
                    y(attributes);
                    break;
                case 30:
                    Z0(attributes);
                    break;
                case HVError.INSTRUCTION_ERROR /* 31 */:
                    V0(attributes);
                    break;
                default:
                    this.f4723c = true;
                    this.f4724d = 1;
                    break;
            }
        }
    }

    private void Y(g.R r10, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String trim = attributes.getValue(i10).trim();
            int i11 = a.f4731b[g.fromString(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 7) {
                w0(r10, trim);
            } else if (i11 == 87) {
                r10.f4576p = N0(trim);
            }
        }
    }

    private void Y0(Attributes attributes) {
        l("<stop>", new Object[0]);
        g.J j10 = this.f4722b;
        if (j10 == null) {
            throw new J2.j("Invalid document. Root element must be <svg>");
        }
        if (!(j10 instanceof g.AbstractC0854j)) {
            throw new J2.j("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
        }
        g.D d10 = new g.D();
        d10.f4568a = this.f4721a;
        d10.f4569b = this.f4722b;
        D(d10, attributes);
        S(d10, attributes);
        R(d10, attributes);
        this.f4722b.h(d10);
        this.f4722b = d10;
    }

    private void Z(String str) {
        this.f4721a.a(new J2.b(b.f.screen, b.u.Document).d(str));
    }

    private void Z0(Attributes attributes) {
        l("<style>", new Object[0]);
        if (this.f4722b == null) {
            throw new J2.j("Invalid document. Root element must be <svg>");
        }
        String str = "all";
        boolean z10 = true;
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String trim = attributes.getValue(i10).trim();
            int i11 = a.f4731b[g.fromString(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 88) {
                z10 = trim.equals("text/css");
            } else if (i11 == 89) {
                str = trim;
            }
        }
        if (z10 && J2.b.b(str, b.f.screen)) {
            this.f4728h = true;
        } else {
            this.f4723c = true;
            this.f4724d = 1;
        }
    }

    private static g.C0848c a0(String str) {
        if ("auto".equals(str) || !str.startsWith("rect(")) {
            return null;
        }
        i iVar = new i(str.substring(5));
        iVar.A();
        g.C0860p q02 = q0(iVar);
        iVar.z();
        g.C0860p q03 = q0(iVar);
        iVar.z();
        g.C0860p q04 = q0(iVar);
        iVar.z();
        g.C0860p q05 = q0(iVar);
        iVar.A();
        if (iVar.f(')') || iVar.h()) {
            return new g.C0848c(q02, q03, q04, q05);
        }
        return null;
    }

    private void a1(Attributes attributes) {
        l("<svg>", new Object[0]);
        g.F f10 = new g.F();
        f10.f4568a = this.f4721a;
        f10.f4569b = this.f4722b;
        D(f10, attributes);
        S(f10, attributes);
        C(f10, attributes);
        Y(f10, attributes);
        Q(f10, attributes);
        g.J j10 = this.f4722b;
        if (j10 == null) {
            this.f4721a.w(f10);
        } else {
            j10.h(f10);
        }
        this.f4722b = f10;
    }

    private static g.C0851f b0(String str) {
        if (str.charAt(0) == '#') {
            J2.c b10 = J2.c.b(str, 1, str.length());
            if (b10 == null) {
                throw new J2.j("Bad hex colour value: " + str);
            }
            int a10 = b10.a();
            if (a10 == 4) {
                int d10 = b10.d();
                int i10 = d10 & 3840;
                int i11 = d10 & 240;
                int i12 = d10 & 15;
                return new g.C0851f(i12 | (i10 << 8) | (-16777216) | (i10 << 12) | (i11 << 8) | (i11 << 4) | (i12 << 4));
            }
            if (a10 == 5) {
                int d11 = b10.d();
                int i13 = 61440 & d11;
                int i14 = d11 & 3840;
                int i15 = d11 & 240;
                int i16 = d11 & 15;
                return new g.C0851f((i16 << 24) | (i16 << 28) | (i13 << 8) | (i13 << 4) | (i14 << 4) | i14 | i15 | (i15 >> 4));
            }
            if (a10 == 7) {
                return new g.C0851f(b10.d() | (-16777216));
            }
            if (a10 == 9) {
                return new g.C0851f((b10.d() >>> 8) | (b10.d() << 24));
            }
            throw new J2.j("Bad hex colour value: " + str);
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean startsWith = lowerCase.startsWith("rgba(");
        if (!startsWith && !lowerCase.startsWith("rgb(")) {
            boolean startsWith2 = lowerCase.startsWith("hsla(");
            if (!startsWith2 && !lowerCase.startsWith("hsl(")) {
                return c0(lowerCase);
            }
            i iVar = new i(str.substring(startsWith2 ? 5 : 4));
            iVar.A();
            float n10 = iVar.n();
            float d12 = iVar.d(n10);
            if (!Float.isNaN(d12)) {
                iVar.f('%');
            }
            float d13 = iVar.d(d12);
            if (!Float.isNaN(d13)) {
                iVar.f('%');
            }
            if (!startsWith2) {
                iVar.A();
                if (!Float.isNaN(d13) && iVar.f(')')) {
                    return new g.C0851f(s(n10, d12, d13) | (-16777216));
                }
                throw new J2.j("Bad hsl() colour value: " + str);
            }
            float d14 = iVar.d(d13);
            iVar.A();
            if (!Float.isNaN(d14) && iVar.f(')')) {
                return new g.C0851f((j(d14 * 256.0f) << 24) | s(n10, d12, d13));
            }
            throw new J2.j("Bad hsla() colour value: " + str);
        }
        i iVar2 = new i(str.substring(startsWith ? 5 : 4));
        iVar2.A();
        float n11 = iVar2.n();
        if (!Float.isNaN(n11) && iVar2.f('%')) {
            n11 = (n11 * 256.0f) / 100.0f;
        }
        float d15 = iVar2.d(n11);
        if (!Float.isNaN(d15) && iVar2.f('%')) {
            d15 = (d15 * 256.0f) / 100.0f;
        }
        float d16 = iVar2.d(d15);
        if (!Float.isNaN(d16) && iVar2.f('%')) {
            d16 = (d16 * 256.0f) / 100.0f;
        }
        if (!startsWith) {
            iVar2.A();
            if (!Float.isNaN(d16) && iVar2.f(')')) {
                return new g.C0851f((j(n11) << 16) | (-16777216) | (j(d15) << 8) | j(d16));
            }
            throw new J2.j("Bad rgb() colour value: " + str);
        }
        float d17 = iVar2.d(d16);
        iVar2.A();
        if (!Float.isNaN(d17) && iVar2.f(')')) {
            return new g.C0851f((j(d17 * 256.0f) << 24) | (j(n11) << 16) | (j(d15) << 8) | j(d16));
        }
        throw new J2.j("Bad rgba() colour value: " + str);
    }

    private void b1(Attributes attributes) {
        l("<symbol>", new Object[0]);
        if (this.f4722b == null) {
            throw new J2.j("Invalid document. Root element must be <svg>");
        }
        g.R t10 = new g.T();
        t10.f4568a = this.f4721a;
        t10.f4569b = this.f4722b;
        D(t10, attributes);
        S(t10, attributes);
        C(t10, attributes);
        Y(t10, attributes);
        this.f4722b.h(t10);
        this.f4722b = t10;
    }

    private static g.C0851f c0(String str) {
        Integer a10 = c.a(str);
        if (a10 != null) {
            return new g.C0851f(a10.intValue());
        }
        throw new J2.j("Invalid colour keyword: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c1(String str) {
        if (this.f4723c) {
            return;
        }
        if (this.f4725e) {
            if (this.f4727g == null) {
                this.f4727g = new StringBuilder(str.length());
            }
            this.f4727g.append(str);
        } else if (this.f4728h) {
            if (this.f4729i == null) {
                this.f4729i = new StringBuilder(str.length());
            }
            this.f4729i.append(str);
        } else if (this.f4722b instanceof g.Y) {
            h(str);
        }
    }

    private static g.O d0(String str) {
        str.hashCode();
        if (str.equals("none")) {
            return g.C0851f.f4610c;
        }
        if (str.equals("currentColor")) {
            return g.C0093g.a();
        }
        try {
            return b0(str);
        } catch (J2.j unused) {
            return null;
        }
    }

    private void d1(Attributes attributes) {
        l("<text>", new Object[0]);
        if (this.f4722b == null) {
            throw new J2.j("Invalid document. Root element must be <svg>");
        }
        g.W w10 = new g.W();
        w10.f4568a = this.f4721a;
        w10.f4569b = this.f4722b;
        D(w10, attributes);
        S(w10, attributes);
        W(w10, attributes);
        C(w10, attributes);
        V(w10, attributes);
        this.f4722b.h(w10);
        this.f4722b = w10;
    }

    private static g.E.a e0(String str) {
        if ("nonzero".equals(str)) {
            return g.E.a.NonZero;
        }
        if ("evenodd".equals(str)) {
            return g.E.a.EvenOdd;
        }
        return null;
    }

    private void e1(char[] cArr, int i10, int i11) {
        if (this.f4723c) {
            return;
        }
        if (this.f4725e) {
            if (this.f4727g == null) {
                this.f4727g = new StringBuilder(i11);
            }
            this.f4727g.append(cArr, i10, i11);
        } else if (this.f4728h) {
            if (this.f4729i == null) {
                this.f4729i = new StringBuilder(i11);
            }
            this.f4729i.append(cArr, i10, i11);
        } else if (this.f4722b instanceof g.Y) {
            h(new String(cArr, i10, i11));
        }
    }

    private static float f0(String str) {
        int length = str.length();
        if (length != 0) {
            return g0(str, 0, length);
        }
        throw new J2.j("Invalid float value (empty string)");
    }

    private void f1(Attributes attributes) {
        l("<textPath>", new Object[0]);
        if (this.f4722b == null) {
            throw new J2.j("Invalid document. Root element must be <svg>");
        }
        g.Z z10 = new g.Z();
        z10.f4568a = this.f4721a;
        z10.f4569b = this.f4722b;
        D(z10, attributes);
        S(z10, attributes);
        C(z10, attributes);
        U(z10, attributes);
        this.f4722b.h(z10);
        this.f4722b = z10;
        g.J j10 = z10.f4569b;
        if (j10 instanceof g.b0) {
            z10.p((g.b0) j10);
        } else {
            z10.p(((g.X) j10).f());
        }
    }

    private static float g0(String str, int i10, int i11) {
        float b10 = new J2.d().b(str, i10, i11);
        if (!Float.isNaN(b10)) {
            return b10;
        }
        throw new J2.j("Invalid float value: " + str);
    }

    private void g1(Attributes attributes) {
        l("<tref>", new Object[0]);
        g.J j10 = this.f4722b;
        if (j10 == null) {
            throw new J2.j("Invalid document. Root element must be <svg>");
        }
        if (!(j10 instanceof g.Y)) {
            throw new J2.j("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
        }
        g.U u10 = new g.U();
        u10.f4568a = this.f4721a;
        u10.f4569b = this.f4722b;
        D(u10, attributes);
        S(u10, attributes);
        C(u10, attributes);
        T(u10, attributes);
        this.f4722b.h(u10);
        g.J j11 = u10.f4569b;
        if (j11 instanceof g.b0) {
            u10.p((g.b0) j11);
        } else {
            u10.p(((g.X) j11).f());
        }
    }

    private void h(String str) {
        g.H h10 = (g.H) this.f4722b;
        int size = h10.f4547i.size();
        g.N n10 = size == 0 ? null : (g.N) h10.f4547i.get(size - 1);
        if (!(n10 instanceof g.c0)) {
            this.f4722b.h(new g.c0(str));
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        g.c0 c0Var = (g.c0) n10;
        sb2.append(c0Var.f4597c);
        sb2.append(str);
        c0Var.f4597c = sb2.toString();
    }

    private static void h0(g.E e10, String str) {
        String s10;
        if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains('|' + str + '|')) {
            i iVar = new i(str);
            Integer num = null;
            g.E.b bVar = null;
            String str2 = null;
            while (true) {
                s10 = iVar.s('/');
                iVar.A();
                if (s10 != null) {
                    if (num != null && bVar != null) {
                        break;
                    }
                    if (!s10.equals("normal") && (num != null || (num = e.a(s10)) == null)) {
                        if (bVar != null || (bVar = k0(s10)) == null) {
                            if (str2 != null || !s10.equals("small-caps")) {
                                break;
                            } else {
                                str2 = s10;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
            g.C0860p j02 = j0(s10);
            if (iVar.f('/')) {
                iVar.A();
                String r10 = iVar.r();
                if (r10 != null) {
                    try {
                        o0(r10);
                    } catch (J2.j unused) {
                        return;
                    }
                }
                iVar.A();
            }
            e10.f4530o = i0(iVar.y());
            e10.f4531p = j02;
            e10.f4532q = Integer.valueOf(num == null ? 400 : num.intValue());
            if (bVar == null) {
                bVar = g.E.b.Normal;
            }
            e10.f4533r = bVar;
            e10.f4516a |= 122880;
        }
    }

    private void h1(Attributes attributes) {
        l("<tspan>", new Object[0]);
        g.J j10 = this.f4722b;
        if (j10 == null) {
            throw new J2.j("Invalid document. Root element must be <svg>");
        }
        if (!(j10 instanceof g.Y)) {
            throw new J2.j("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
        }
        g.V v10 = new g.V();
        v10.f4568a = this.f4721a;
        v10.f4569b = this.f4722b;
        D(v10, attributes);
        S(v10, attributes);
        C(v10, attributes);
        V(v10, attributes);
        this.f4722b.h(v10);
        this.f4722b = v10;
        g.J j11 = v10.f4569b;
        if (j11 instanceof g.b0) {
            v10.p((g.b0) j11);
        } else {
            v10.p(((g.X) j11).f());
        }
    }

    private void i(Attributes attributes) {
        l("<circle>", new Object[0]);
        if (this.f4722b == null) {
            throw new J2.j("Invalid document. Root element must be <svg>");
        }
        g.C0849d c0849d = new g.C0849d();
        c0849d.f4568a = this.f4721a;
        c0849d.f4569b = this.f4722b;
        D(c0849d, attributes);
        S(c0849d, attributes);
        W(c0849d, attributes);
        C(c0849d, attributes);
        A(c0849d, attributes);
        this.f4722b.h(c0849d);
    }

    private static List i0(String str) {
        i iVar = new i(str);
        ArrayList arrayList = null;
        do {
            String q10 = iVar.q();
            if (q10 == null) {
                q10 = iVar.u(',');
            }
            if (q10 == null) {
                break;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(q10);
            iVar.z();
        } while (!iVar.h());
        return arrayList;
    }

    private void i1(Attributes attributes) {
        l("<use>", new Object[0]);
        if (this.f4722b == null) {
            throw new J2.j("Invalid document. Root element must be <svg>");
        }
        g.e0 e0Var = new g.e0();
        e0Var.f4568a = this.f4721a;
        e0Var.f4569b = this.f4722b;
        D(e0Var, attributes);
        S(e0Var, attributes);
        W(e0Var, attributes);
        C(e0Var, attributes);
        X(e0Var, attributes);
        this.f4722b.h(e0Var);
        this.f4722b = e0Var;
    }

    private static int j(float f10) {
        if (f10 < 0.0f) {
            return 0;
        }
        if (f10 > 255.0f) {
            return 255;
        }
        return Math.round(f10);
    }

    private static g.C0860p j0(String str) {
        try {
            g.C0860p a10 = d.a(str);
            return a10 == null ? o0(str) : a10;
        } catch (J2.j unused) {
            return null;
        }
    }

    private void j1(Attributes attributes) {
        l("<view>", new Object[0]);
        if (this.f4722b == null) {
            throw new J2.j("Invalid document. Root element must be <svg>");
        }
        g.R f0Var = new g.f0();
        f0Var.f4568a = this.f4721a;
        f0Var.f4569b = this.f4722b;
        D(f0Var, attributes);
        C(f0Var, attributes);
        Y(f0Var, attributes);
        this.f4722b.h(f0Var);
        this.f4722b = f0Var;
    }

    private void k(Attributes attributes) {
        l("<clipPath>", new Object[0]);
        if (this.f4722b == null) {
            throw new J2.j("Invalid document. Root element must be <svg>");
        }
        g.C0850e c0850e = new g.C0850e();
        c0850e.f4568a = this.f4721a;
        c0850e.f4569b = this.f4722b;
        D(c0850e, attributes);
        S(c0850e, attributes);
        W(c0850e, attributes);
        C(c0850e, attributes);
        B(c0850e, attributes);
        this.f4722b.h(c0850e);
        this.f4722b = c0850e;
    }

    private static g.E.b k0(String str) {
        str.hashCode();
        switch (str) {
            case "oblique":
                return g.E.b.Oblique;
            case "italic":
                return g.E.b.Italic;
            case "normal":
                return g.E.b.Normal;
            default:
                return null;
        }
    }

    private void k1(Attributes attributes) {
        l("<switch>", new Object[0]);
        if (this.f4722b == null) {
            throw new J2.j("Invalid document. Root element must be <svg>");
        }
        g.S s10 = new g.S();
        s10.f4568a = this.f4721a;
        s10.f4569b = this.f4722b;
        D(s10, attributes);
        S(s10, attributes);
        W(s10, attributes);
        C(s10, attributes);
        this.f4722b.h(s10);
        this.f4722b = s10;
    }

    private static Integer l0(String str) {
        return e.a(str);
    }

    private void m(Attributes attributes) {
        l("<defs>", new Object[0]);
        if (this.f4722b == null) {
            throw new J2.j("Invalid document. Root element must be <svg>");
        }
        g.C0852h c0852h = new g.C0852h();
        c0852h.f4568a = this.f4721a;
        c0852h.f4569b = this.f4722b;
        D(c0852h, attributes);
        S(c0852h, attributes);
        W(c0852h, attributes);
        this.f4722b.h(c0852h);
        this.f4722b = c0852h;
    }

    private static String m0(String str, String str2) {
        if (!str.equals("none") && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    private void n(Attributes attributes) {
        l("<ellipse>", new Object[0]);
        if (this.f4722b == null) {
            throw new J2.j("Invalid document. Root element must be <svg>");
        }
        g.C0853i c0853i = new g.C0853i();
        c0853i.f4568a = this.f4721a;
        c0853i.f4569b = this.f4722b;
        D(c0853i, attributes);
        S(c0853i, attributes);
        W(c0853i, attributes);
        C(c0853i, attributes);
        E(c0853i, attributes);
        this.f4722b.h(c0853i);
    }

    private Float n0(String str) {
        if (str.length() == 0) {
            throw new J2.j("Invalid offset value in <stop> (empty string)");
        }
        int length = str.length();
        boolean z10 = true;
        if (str.charAt(str.length() - 1) == '%') {
            length--;
        } else {
            z10 = false;
        }
        try {
            float g02 = g0(str, 0, length);
            float f10 = 100.0f;
            if (z10) {
                g02 /= 100.0f;
            }
            if (g02 < 0.0f) {
                f10 = 0.0f;
            } else if (g02 <= 100.0f) {
                f10 = g02;
            }
            return Float.valueOf(f10);
        } catch (NumberFormatException e10) {
            throw new J2.j("Invalid offset value in <stop>: " + str, e10);
        }
    }

    static g.C0860p o0(String str) {
        if (str.length() == 0) {
            throw new J2.j("Invalid length value (empty string)");
        }
        int length = str.length();
        g.d0 d0Var = g.d0.px;
        char charAt = str.charAt(length - 1);
        if (charAt == '%') {
            length--;
            d0Var = g.d0.percent;
        } else if (length > 2 && Character.isLetter(charAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                d0Var = g.d0.valueOf(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new J2.j("Invalid length unit specifier: " + str);
            }
        }
        try {
            return new g.C0860p(g0(str, 0, length), d0Var);
        } catch (NumberFormatException e10) {
            throw new J2.j("Invalid length value: " + str, e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(String str, String str2, String str3) {
        if (this.f4723c) {
            int i10 = this.f4724d - 1;
            this.f4724d = i10;
            if (i10 == 0) {
                this.f4723c = false;
                return;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || BuildConfig.FLAVOR.equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            int i11 = a.f4730a[h.fromString(str2).ordinal()];
            if (i11 != 1 && i11 != 2 && i11 != 4 && i11 != 5 && i11 != 13 && i11 != 14) {
                switch (i11) {
                    case HVError.FACE_DETECTION_ERROR /* 22 */:
                    case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                        this.f4725e = false;
                        StringBuilder sb2 = this.f4727g;
                        if (sb2 != null) {
                            h hVar = this.f4726f;
                            if (hVar == h.title) {
                                this.f4721a.x(sb2.toString());
                            } else if (hVar == h.desc) {
                                this.f4721a.s(sb2.toString());
                            }
                            this.f4727g.setLength(0);
                            break;
                        }
                        break;
                    case 30:
                        StringBuilder sb3 = this.f4729i;
                        if (sb3 != null) {
                            this.f4728h = false;
                            Z(sb3.toString());
                            this.f4729i.setLength(0);
                            break;
                        }
                        break;
                }
                return;
            }
            this.f4722b = ((g.N) this.f4722b).f4569b;
        }
    }

    private static List p0(String str) {
        if (str.length() == 0) {
            throw new J2.j("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        i iVar = new i(str);
        iVar.A();
        while (!iVar.h()) {
            float n10 = iVar.n();
            if (Float.isNaN(n10)) {
                throw new J2.j("Invalid length list value: " + iVar.b());
            }
            g.d0 v10 = iVar.v();
            if (v10 == null) {
                v10 = g.d0.px;
            }
            arrayList.add(new g.C0860p(n10, v10));
            iVar.z();
        }
        return arrayList;
    }

    private void q(Attributes attributes) {
        l("<g>", new Object[0]);
        if (this.f4722b == null) {
            throw new J2.j("Invalid document. Root element must be <svg>");
        }
        g.C0857m c0857m = new g.C0857m();
        c0857m.f4568a = this.f4721a;
        c0857m.f4569b = this.f4722b;
        D(c0857m, attributes);
        S(c0857m, attributes);
        W(c0857m, attributes);
        C(c0857m, attributes);
        this.f4722b.h(c0857m);
        this.f4722b = c0857m;
    }

    private static g.C0860p q0(i iVar) {
        return iVar.g("auto") ? new g.C0860p(0.0f) : iVar.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(String str, Map map) {
        if (str.equals("xml-stylesheet")) {
            J2.g.k();
        }
    }

    private static Float r0(String str) {
        try {
            float f02 = f0(str);
            float f10 = 0.0f;
            if (f02 >= 0.0f) {
                f10 = 1.0f;
                if (f02 > 1.0f) {
                }
                return Float.valueOf(f02);
            }
            f02 = f10;
            return Float.valueOf(f02);
        } catch (J2.j unused) {
            return null;
        }
    }

    private static int s(float f10, float f11, float f12) {
        float f13 = f10 % 360.0f;
        if (f10 < 0.0f) {
            f13 += 360.0f;
        }
        float f14 = f13 / 60.0f;
        float f15 = f11 / 100.0f;
        float f16 = f12 / 100.0f;
        if (f15 < 0.0f) {
            f15 = 0.0f;
        } else if (f15 > 1.0f) {
            f15 = 1.0f;
        }
        float f17 = f16 >= 0.0f ? f16 > 1.0f ? 1.0f : f16 : 0.0f;
        float f18 = f17 <= 0.5f ? (f15 + 1.0f) * f17 : (f17 + f15) - (f15 * f17);
        float f19 = (f17 * 2.0f) - f18;
        return j(t(f19, f18, f14 - 2.0f) * 256.0f) | (j(t(f19, f18, f14 + 2.0f) * 256.0f) << 16) | (j(t(f19, f18, f14) * 256.0f) << 8);
    }

    private static Boolean s0(String str) {
        str.hashCode();
        switch (str) {
            case "hidden":
            case "scroll":
                return Boolean.FALSE;
            case "auto":
            case "visible":
                return Boolean.TRUE;
            default:
                return null;
        }
    }

    private static float t(float f10, float f11, float f12) {
        float f13;
        if (f12 < 0.0f) {
            f12 += 6.0f;
        }
        if (f12 >= 6.0f) {
            f12 -= 6.0f;
        }
        if (f12 < 1.0f) {
            f13 = (f11 - f10) * f12;
        } else {
            if (f12 < 3.0f) {
                return f11;
            }
            if (f12 >= 4.0f) {
                return f10;
            }
            f13 = (f11 - f10) * (4.0f - f12);
        }
        return f13 + f10;
    }

    private static g.O t0(String str) {
        if (!str.startsWith("url(")) {
            return d0(str);
        }
        int indexOf = str.indexOf(")");
        if (indexOf == -1) {
            return new g.C0865u(str.substring(4).trim(), null);
        }
        String trim = str.substring(4, indexOf).trim();
        String trim2 = str.substring(indexOf + 1).trim();
        return new g.C0865u(trim, trim2.length() > 0 ? d0(trim2) : null);
    }

    private void u(Attributes attributes) {
        l("<image>", new Object[0]);
        if (this.f4722b == null) {
            throw new J2.j("Invalid document. Root element must be <svg>");
        }
        g.C0859o c0859o = new g.C0859o();
        c0859o.f4568a = this.f4721a;
        c0859o.f4569b = this.f4722b;
        D(c0859o, attributes);
        S(c0859o, attributes);
        W(c0859o, attributes);
        C(c0859o, attributes);
        G(c0859o, attributes);
        this.f4722b.h(c0859o);
        this.f4722b = c0859o;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x027b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static g.C0867w u0(String str) {
        float d10;
        float d11;
        float f10;
        float f11;
        i iVar = new i(str);
        g.C0867w c0867w = new g.C0867w();
        if (iVar.h()) {
            return c0867w;
        }
        int intValue = iVar.l().intValue();
        int i10 = 109;
        if (intValue != 77 && intValue != 109) {
            return c0867w;
        }
        int i11 = intValue;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        while (true) {
            iVar.A();
            switch (i11) {
                case 65:
                case 97:
                    float n10 = iVar.n();
                    float d12 = iVar.d(n10);
                    float d13 = iVar.d(d12);
                    Boolean c10 = iVar.c(Float.valueOf(d13));
                    Boolean c11 = iVar.c(c10);
                    float e10 = iVar.e(c11);
                    float d14 = iVar.d(e10);
                    if (!Float.isNaN(d14) && n10 >= 0.0f && d12 >= 0.0f) {
                        if (i11 == 97) {
                            e10 += f12;
                            d14 += f14;
                        }
                        c0867w.d(n10, d12, d13, c10.booleanValue(), c11.booleanValue(), e10, d14);
                        f12 = e10;
                        f13 = f12;
                        f14 = d14;
                        f15 = f14;
                        iVar.z();
                        if (!iVar.h()) {
                            break;
                        } else {
                            if (iVar.i()) {
                                i11 = iVar.l().intValue();
                            }
                            i10 = 109;
                        }
                    }
                    break;
                case 67:
                case 99:
                    float n11 = iVar.n();
                    float d15 = iVar.d(n11);
                    float d16 = iVar.d(d15);
                    float d17 = iVar.d(d16);
                    d10 = iVar.d(d17);
                    d11 = iVar.d(d10);
                    if (Float.isNaN(d11)) {
                        Log.e("SVGParser", "Bad path coords for " + ((char) i11) + " path segment");
                        break;
                    } else {
                        if (i11 == 99) {
                            d10 += f12;
                            d11 += f14;
                            n11 += f12;
                            d15 += f14;
                            d16 += f12;
                            d17 += f14;
                        }
                        f10 = d16;
                        f11 = d17;
                        c0867w.c(n11, d15, f10, f11, d10, d11);
                        f13 = f10;
                        f12 = d10;
                        f15 = f11;
                        f14 = d11;
                        iVar.z();
                        if (!iVar.h()) {
                        }
                    }
                    break;
                case 72:
                case 104:
                    float n12 = iVar.n();
                    if (Float.isNaN(n12)) {
                        Log.e("SVGParser", "Bad path coords for " + ((char) i11) + " path segment");
                        break;
                    } else {
                        if (i11 == 104) {
                            n12 += f12;
                        }
                        f12 = n12;
                        c0867w.e(f12, f14);
                        f13 = f12;
                        iVar.z();
                        if (!iVar.h()) {
                        }
                    }
                    break;
                case com.swmansion.reanimated.BuildConfig.REACT_NATIVE_MINOR_VERSION /* 76 */:
                case 108:
                    float n13 = iVar.n();
                    float d18 = iVar.d(n13);
                    if (Float.isNaN(d18)) {
                        Log.e("SVGParser", "Bad path coords for " + ((char) i11) + " path segment");
                        break;
                    } else {
                        if (i11 == 108) {
                            n13 += f12;
                            d18 += f14;
                        }
                        f12 = n13;
                        f14 = d18;
                        c0867w.e(f12, f14);
                        f13 = f12;
                        f15 = f14;
                        iVar.z();
                        if (!iVar.h()) {
                        }
                    }
                    break;
                case 77:
                case 109:
                    float n14 = iVar.n();
                    float d19 = iVar.d(n14);
                    if (Float.isNaN(d19)) {
                        Log.e("SVGParser", "Bad path coords for " + ((char) i11) + " path segment");
                        break;
                    } else {
                        if (i11 == i10 && !c0867w.i()) {
                            n14 += f12;
                            d19 += f14;
                        }
                        f12 = n14;
                        f14 = d19;
                        c0867w.b(f12, f14);
                        f13 = f12;
                        f16 = f13;
                        f15 = f14;
                        f17 = f15;
                        i11 = i11 != i10 ? 76 : 108;
                        iVar.z();
                        if (!iVar.h()) {
                        }
                    }
                    break;
                case 81:
                case 113:
                    f13 = iVar.n();
                    f15 = iVar.d(f13);
                    float d20 = iVar.d(f15);
                    float d21 = iVar.d(d20);
                    if (Float.isNaN(d21)) {
                        Log.e("SVGParser", "Bad path coords for " + ((char) i11) + " path segment");
                        break;
                    } else {
                        if (i11 == 113) {
                            d20 += f12;
                            d21 += f14;
                            f13 += f12;
                            f15 += f14;
                        }
                        f12 = d20;
                        f14 = d21;
                        c0867w.a(f13, f15, f12, f14);
                        iVar.z();
                        if (!iVar.h()) {
                        }
                    }
                    break;
                case 83:
                case 115:
                    float f18 = (f12 * 2.0f) - f13;
                    float f19 = (2.0f * f14) - f15;
                    float n15 = iVar.n();
                    float d22 = iVar.d(n15);
                    d10 = iVar.d(d22);
                    d11 = iVar.d(d10);
                    if (Float.isNaN(d11)) {
                        Log.e("SVGParser", "Bad path coords for " + ((char) i11) + " path segment");
                        break;
                    } else {
                        if (i11 == 115) {
                            d10 += f12;
                            d11 += f14;
                            n15 += f12;
                            d22 += f14;
                        }
                        f10 = n15;
                        f11 = d22;
                        c0867w.c(f18, f19, f10, f11, d10, d11);
                        f13 = f10;
                        f12 = d10;
                        f15 = f11;
                        f14 = d11;
                        iVar.z();
                        if (!iVar.h()) {
                        }
                    }
                    break;
                case 84:
                case 116:
                    f13 = (f12 * 2.0f) - f13;
                    f15 = (2.0f * f14) - f15;
                    float n16 = iVar.n();
                    float d23 = iVar.d(n16);
                    if (Float.isNaN(d23)) {
                        Log.e("SVGParser", "Bad path coords for " + ((char) i11) + " path segment");
                        break;
                    } else {
                        if (i11 == 116) {
                            n16 += f12;
                            d23 += f14;
                        }
                        f12 = n16;
                        f14 = d23;
                        c0867w.a(f13, f15, f12, f14);
                        iVar.z();
                        if (!iVar.h()) {
                        }
                    }
                    break;
                case 86:
                case 118:
                    float n17 = iVar.n();
                    if (Float.isNaN(n17)) {
                        Log.e("SVGParser", "Bad path coords for " + ((char) i11) + " path segment");
                        break;
                    } else {
                        if (i11 == 118) {
                            n17 += f14;
                        }
                        f14 = n17;
                        c0867w.e(f12, f14);
                        f15 = f14;
                        iVar.z();
                        if (!iVar.h()) {
                        }
                    }
                    break;
                case 90:
                case 122:
                    c0867w.close();
                    f12 = f16;
                    f13 = f12;
                    f14 = f17;
                    f15 = f14;
                    iVar.z();
                    if (!iVar.h()) {
                    }
                    break;
            }
            return c0867w;
        }
    }

    private void v(Attributes attributes) {
        l("<line>", new Object[0]);
        if (this.f4722b == null) {
            throw new J2.j("Invalid document. Root element must be <svg>");
        }
        g.C0861q c0861q = new g.C0861q();
        c0861q.f4568a = this.f4721a;
        c0861q.f4569b = this.f4722b;
        D(c0861q, attributes);
        S(c0861q, attributes);
        W(c0861q, attributes);
        C(c0861q, attributes);
        H(c0861q, attributes);
        this.f4722b.h(c0861q);
    }

    static J2.e v0(String str) {
        e.b bVar;
        i iVar = new i(str);
        iVar.A();
        String r10 = iVar.r();
        if ("defer".equals(r10)) {
            iVar.A();
            r10 = iVar.r();
        }
        e.a a10 = b.a(r10);
        iVar.A();
        if (iVar.h()) {
            bVar = null;
        } else {
            String r11 = iVar.r();
            r11.hashCode();
            if (r11.equals("meet")) {
                bVar = e.b.meet;
            } else {
                if (!r11.equals("slice")) {
                    throw new J2.j("Invalid preserveAspectRatio definition: " + str);
                }
                bVar = e.b.slice;
            }
        }
        return new J2.e(a10, bVar);
    }

    private void w(Attributes attributes) {
        l("<linearGradient>", new Object[0]);
        if (this.f4722b == null) {
            throw new J2.j("Invalid document. Root element must be <svg>");
        }
        g.M m10 = new g.M();
        m10.f4568a = this.f4721a;
        m10.f4569b = this.f4722b;
        D(m10, attributes);
        S(m10, attributes);
        F(m10, attributes);
        I(m10, attributes);
        this.f4722b.h(m10);
        this.f4722b = m10;
    }

    private static void w0(g.P p10, String str) {
        p10.f4570o = v0(str);
    }

    private void x(Attributes attributes) {
        l("<marker>", new Object[0]);
        if (this.f4722b == null) {
            throw new J2.j("Invalid document. Root element must be <svg>");
        }
        g.C0862r c0862r = new g.C0862r();
        c0862r.f4568a = this.f4721a;
        c0862r.f4569b = this.f4722b;
        D(c0862r, attributes);
        S(c0862r, attributes);
        C(c0862r, attributes);
        Y(c0862r, attributes);
        J(c0862r, attributes);
        this.f4722b.h(c0862r);
        this.f4722b = c0862r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map x0(i iVar) {
        HashMap hashMap = new HashMap();
        iVar.A();
        String s10 = iVar.s('=');
        while (s10 != null) {
            iVar.f('=');
            hashMap.put(s10, iVar.q());
            iVar.A();
            s10 = iVar.s('=');
        }
        return hashMap;
    }

    private void y(Attributes attributes) {
        l("<mask>", new Object[0]);
        if (this.f4722b == null) {
            throw new J2.j("Invalid document. Root element must be <svg>");
        }
        g.C0863s c0863s = new g.C0863s();
        c0863s.f4568a = this.f4721a;
        c0863s.f4569b = this.f4722b;
        D(c0863s, attributes);
        S(c0863s, attributes);
        C(c0863s, attributes);
        K(c0863s, attributes);
        this.f4722b.h(c0863s);
        this.f4722b = c0863s;
    }

    private static g.E.e y0(String str) {
        str.hashCode();
        switch (str) {
            case "optimizeQuality":
                return g.E.e.optimizeQuality;
            case "auto":
                return g.E.e.auto;
            case "optimizeSpeed":
                return g.E.e.optimizeSpeed;
            default:
                return null;
        }
    }

    private static Set z0(String str) {
        i iVar = new i(str);
        HashSet hashSet = new HashSet();
        while (!iVar.h()) {
            String r10 = iVar.r();
            if (r10.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                hashSet.add(r10.substring(35));
            } else {
                hashSet.add("UNSUPPORTED");
            }
            iVar.A();
        }
        return hashSet;
    }

    J2.g z(InputStream inputStream, boolean z10) {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int read = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (read == 35615) {
                inputStream = new BufferedInputStream(new GZIPInputStream(inputStream));
            }
        } catch (IOException unused) {
        }
        try {
            inputStream.mark(4096);
            L0(inputStream, z10);
            return this.f4721a;
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
    }

    private void l(String str, Object... objArr) {
    }
}
