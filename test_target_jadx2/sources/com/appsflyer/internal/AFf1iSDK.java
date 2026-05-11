package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.appsflyer.AFLogger;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public final class AFf1iSDK {
    private static AFf1iSDK getRevenue;
    private final Map<String, String> getCurrencyIso4217Code = new HashMap<String, String>() { // from class: com.appsflyer.internal.AFf1iSDK.3
        {
            put("aa", "ro.arch");
            put("ab", "ro.chipname");
            put("ac", "ro.dalvik.vm.native.bridge");
            put("ad", "persist.sys.nativebridge");
            put("ae", "ro.enable.native.bridge.exec");
            put("af", "dalvik.vm.isa.x86.features");
            put("ag", "dalvik.vm.isa.x86.variant");
            put("ah", "ro.zygote");
            put("ai", "ro.allow.mock.location");
            put("aj", "ro.dalvik.vm.isa.arm");
            put("ak", "dalvik.vm.isa.arm.features");
            put("al", "dalvik.vm.isa.arm.variant");
            put("am", "dalvik.vm.isa.arm64.features");
            put("an", "dalvik.vm.isa.arm64.variant");
            put("ao", "vzw.os.rooted");
            put("ap", "ro.build.user");
            put("aq", "ro.kernel.qemu");
            put("ar", "ro.hardware");
            put("as", "ro.product.cpu.abi");
            put("at", "ro.product.cpu.abilist");
            put("au", "ro.product.cpu.abilist32");
            put("av", "ro.product.cpu.abilist64");
        }
    };

    enum AFa1uSDK {
        XPOSED("xps"),
        FRIDA("frd");

        String getMonetizationNetwork;

        AFa1uSDK(String str) {
            this.getMonetizationNetwork = str;
        }
    }

    enum AFa1ySDK {
        HOOKING("hk"),
        DEBUGGABLE("dbg");

        String getMonetizationNetwork;

        AFa1ySDK(String str) {
            this.getMonetizationNetwork = str;
        }
    }

    private AFf1iSDK() {
    }

    private static String AFAdRevenueData(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception e10) {
            AFLogger.afErrorLogForExcManagerOnly("error in props rfl", e10);
            return null;
        }
    }

    public static AFf1iSDK getCurrencyIso4217Code() {
        if (getRevenue == null) {
            getRevenue = new AFf1iSDK();
        }
        return getRevenue;
    }

    private AFg1gSDK getMediationNetwork(Context context) {
        AFg1gSDK aFg1gSDK = new AFg1gSDK();
        try {
            aFg1gSDK.getMonetizationNetwork(AFa1ySDK.HOOKING.getMonetizationNetwork, getRevenue());
            aFg1gSDK.getMonetizationNetwork(AFa1ySDK.DEBUGGABLE.getMonetizationNetwork, Boolean.valueOf(getMonetizationNetwork(context)));
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("failed to perform analysis checks", th);
        }
        return aFg1gSDK;
    }

    private static boolean getMonetizationNetwork(String str) {
        return str.matches("\\d+");
    }

    public final Object getRevenue(Context context, String str) {
        String str2 = null;
        if (str != null) {
            try {
                if (!getMonetizationNetwork(str)) {
                }
                AFg1gSDK aFg1gSDK = new AFg1gSDK();
                aFg1gSDK.getMonetizationNetwork("pr", getMediationNetwork());
                aFg1gSDK.getMonetizationNetwork("an", getMediationNetwork(context));
                return aFg1gSDK;
            } catch (Exception e10) {
                AFLogger.afErrorLogForExcManagerOnly("could not get anti fraud data", e10);
                return str2;
            }
        }
        str2 = "invalid timestamp";
        AFg1gSDK aFg1gSDK2 = new AFg1gSDK();
        aFg1gSDK2.getMonetizationNetwork("pr", getMediationNetwork());
        aFg1gSDK2.getMonetizationNetwork("an", getMediationNetwork(context));
        return aFg1gSDK2;
    }

    private static boolean getMonetizationNetwork(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    private static String getRevenue() {
        StringBuilder sb2 = new StringBuilder();
        try {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it = Thread.getAllStackTraces().entrySet().iterator();
            int i10 = 0;
            int i11 = 0;
            while (it.hasNext()) {
                for (StackTraceElement stackTraceElement : it.next().getValue()) {
                    if (stackTraceElement.toString().contains("de.robv.android.xposed") && i11 <= 2) {
                        i11++;
                        sb2.append(AFa1uSDK.XPOSED.getMonetizationNetwork);
                        if (stackTraceElement.getMethodName().equals("main")) {
                            sb2.append("+a");
                        }
                        if (stackTraceElement.getMethodName().equals("handleHookedMethod")) {
                            sb2.append("+h");
                        }
                        sb2.append(";");
                    }
                    if (stackTraceElement.getClassName().equals("com.android.internal.os.ZygoteInit")) {
                        i10++;
                    }
                }
            }
            if (i10 > 1) {
                sb2.append("mz;");
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("hooking check error", th);
        }
        try {
            StringBuilder sb3 = new StringBuilder("/proc/");
            sb3.append(Process.myPid());
            sb3.append("/maps");
            if (getRevenue(sb3.toString(), "frida")) {
                sb2.append(AFa1uSDK.FRIDA.getMonetizationNetwork);
                if (Build.VERSION.SDK_INT < 29 && getRevenue("/proc/net/tcp", "69A2")) {
                    sb2.append("+prt");
                }
            }
        } catch (Exception e10) {
            AFLogger.afErrorLogForExcManagerOnly("frida detection error", e10);
            sb2.append(e10.getMessage().toLowerCase(Locale.getDefault()));
        }
        sb2.append(";");
        return sb2.toString();
    }

    private AFg1gSDK getMediationNetwork() {
        AFg1gSDK aFg1gSDK = new AFg1gSDK();
        try {
            for (Map.Entry<String, String> entry : this.getCurrencyIso4217Code.entrySet()) {
                String AFAdRevenueData = AFAdRevenueData(entry.getValue());
                if (AFAdRevenueData != null && !AFAdRevenueData.equals(BuildConfig.FLAVOR)) {
                    aFg1gSDK.getMonetizationNetwork(entry.getKey(), AFAdRevenueData);
                }
            }
        } catch (Exception e10) {
            AFLogger.afErrorLogForExcManagerOnly("failed to create props", e10);
        }
        return aFg1gSDK;
    }

    private static boolean getRevenue(String str, String str2) {
        String readLine;
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, Charset.defaultCharset()));
            String lowerCase = str2.toLowerCase(Locale.getDefault());
            do {
                readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    fileInputStream.close();
                    return false;
                }
            } while (!new HashSet(Arrays.asList(readLine.toLowerCase(Locale.getDefault()).split("[\\s.,\\]\\-:/_\\[]"))).contains(lowerCase));
            bufferedReader.close();
            fileInputStream.close();
            return true;
        } catch (FileNotFoundException e10) {
            AFLogger.afErrorLogForExcManagerOnly("FNF", e10);
            throw new Exception("FNF");
        } catch (IOException e11) {
            AFLogger.afErrorLogForExcManagerOnly("IOF", e11);
            throw new Exception("IOF");
        } catch (Exception e12) {
            AFLogger.afErrorLogForExcManagerOnly("GF", e12);
            throw new Exception("GF");
        }
    }
}
