package co.hyperverge.hypersnapsdk.service.sensorbiometrics;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.Base64;
import android.util.Log;
import co.hyperverge.hypersnapsdk.HyperSnapSDK;
import co.hyperverge.hypersnapsdk.data.DataRepository;
import co.hyperverge.hypersnapsdk.helpers.SDKInternalConfig;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import co.hyperverge.hypersnapsdk.utils.Utils;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.gson.g;
import com.google.gson.k;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.conscrypt.BuildConfig;
import org.json.JSONObject;
import u5.C4870a;

/* loaded from: classes.dex */
public class HVSensorBiometrics {
    private static final String TAG = "co.hyperverge.hypersnapsdk.service.sensorbiometrics.HVSensorBiometrics";
    private File accelerometerSensorDataFile;
    private File geomagneticSensorDataFile;
    private File gyroscopeSensorDataFile;
    private final Context mContext;
    private Sensor mSensorAccelerometer;
    private Sensor mSensorGeoMagnetic;
    private Sensor mSensorGyroscope;
    private final SensorManager mSensorManager;
    private Sensor mSensorOrientation;
    private Sensor mSensorPressure;
    private File orientationSensorDataFile;
    private File pressureSensorDataFile;
    private File sensorDataEventsFile;
    private File sensorDataZipFile;
    private final String postSensorDataEndpointBluePrint = "https://armxjib6ub.execute-api.ap-southeast-1.amazonaws.com/prod/" + HyperSnapSDK.getInstance().getHyperSnapSDKConfig().getAppId() + "/sensorData/";
    private String postSensorDataEndpoint = BuildConfig.FLAVOR;
    private k sensorDataEventsJsonObject = new k();
    private k accelerometerSensorDataJsonObject = new k();
    private k geomagneticSensorDataJsonObject = new k();
    private k gyroscopeSensorDataJsonObject = new k();
    private k pressureSensorDataJsonObject = new k();
    private k orientationSensorDataJsonObject = new k();
    private final int samplingPeriodMicroseconds = ModuleDescriptor.MODULE_VERSION;
    private final ExecutorService executor = Executors.newSingleThreadExecutor();
    private boolean isHvSensorBiometricsRunning = false;
    private boolean isSendingToServer = false;
    private final SensorEventListener mSensorEventListener = new SensorEventListener() { // from class: co.hyperverge.hypersnapsdk.service.sensorbiometrics.HVSensorBiometrics.1
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (HVSensorBiometrics.this.isSendingToServer) {
                return;
            }
            int type = sensorEvent.sensor.getType();
            float[] fArr = sensorEvent.values;
            g gVar = new g(fArr.length);
            for (float f10 : fArr) {
                gVar.w(Float.valueOf(f10));
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (type == 1) {
                HVSensorBiometrics.this.accelerometerSensorDataJsonObject.v(String.valueOf(currentTimeMillis), gVar);
                return;
            }
            if (type == 2) {
                HVSensorBiometrics.this.geomagneticSensorDataJsonObject.v(String.valueOf(currentTimeMillis), gVar);
                return;
            }
            if (type == 3) {
                HVSensorBiometrics.this.orientationSensorDataJsonObject.v(String.valueOf(currentTimeMillis), gVar);
            } else if (type == 4) {
                HVSensorBiometrics.this.gyroscopeSensorDataJsonObject.v(String.valueOf(currentTimeMillis), gVar);
            } else {
                if (type != 6) {
                    return;
                }
                HVSensorBiometrics.this.pressureSensorDataJsonObject.v(String.valueOf(currentTimeMillis), gVar);
            }
        }
    };
    private final DataRepository dataRepository = DataRepository.getInstance();

    public HVSensorBiometrics(Context context) {
        this.mContext = context;
        this.mSensorManager = (SensorManager) context.getSystemService("sensor");
        initialiseSensors();
        createSensorDataFiles();
    }

    private File createEmptyFile(File file, String str) {
        String str2 = TAG;
        HVLogUtils.d(str2, "createEmptyFile() called with: folder = [" + file + "], sensorDataFileName = [" + str + "]");
        File file2 = new File(file, str);
        if (str.contains("zip")) {
            Log.d(str2, "created zip file");
        } else {
            try {
                PrintWriter printWriter = new PrintWriter(file2);
                try {
                    printWriter.print(BuildConfig.FLAVOR);
                    printWriter.close();
                } finally {
                }
            } catch (Exception e10) {
                String str3 = TAG;
                HVLogUtils.e(str3, "createEmptyFile(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
                Log.e(str3, Utils.getErrorMessage(e10));
            }
        }
        return file2;
    }

    private void createSensorDataFiles() {
        HVLogUtils.d(TAG, "createSensorDataFiles() called");
        File file = new File(this.mContext.getFilesDir(), "hv/sensorData");
        if (!file.exists()) {
            file.mkdirs();
        }
        this.sensorDataEventsFile = createEmptyFile(file, "sensor_data_events.json");
        this.accelerometerSensorDataFile = createEmptyFile(file, "accelerometerSensorData.json");
        this.geomagneticSensorDataFile = createEmptyFile(file, "geomagneticSensorData.json");
        this.gyroscopeSensorDataFile = createEmptyFile(file, "gyroscopeSensorData.json");
        this.pressureSensorDataFile = createEmptyFile(file, "pressureSensorData.json");
        this.orientationSensorDataFile = createEmptyFile(file, "orientationSensorData.json");
    }

    private void createSensorDataZipFile(String str) {
        HVLogUtils.d(TAG, "createSensorDataZipFile() called with: sensorDataZipFileName = [" + str + "]");
        File file = new File(this.mContext.getFilesDir(), "hv/sensorData");
        if (!file.exists()) {
            file.mkdirs();
        }
        this.sensorDataZipFile = createEmptyFile(file, str);
        this.postSensorDataEndpoint = this.postSensorDataEndpointBluePrint.concat(str);
    }

    private boolean doSensorDataFilesExist() {
        HVLogUtils.d(TAG, "doSensorDataFilesExist() called");
        return (this.sensorDataEventsFile == null || this.accelerometerSensorDataFile == null || this.geomagneticSensorDataFile == null || this.gyroscopeSensorDataFile == null || this.pressureSensorDataFile == null || this.orientationSensorDataFile == null) ? false : true;
    }

    private void handleSensorData(boolean z10) {
        String str = TAG;
        HVLogUtils.d(str, "handleSensorData() called");
        if (doSensorDataFilesExist()) {
            unregisterSensorManager();
        } else {
            Log.e(str, "sensorDataFiles do not exist");
        }
        if (this.sensorDataZipFile != null) {
            Utils.writeIntoZipFile(this.mContext, Arrays.asList(this.sensorDataEventsFile.getAbsolutePath(), this.accelerometerSensorDataFile.getAbsolutePath(), this.geomagneticSensorDataFile.getAbsolutePath(), this.gyroscopeSensorDataFile.getAbsolutePath(), this.pressureSensorDataFile.getAbsolutePath(), this.orientationSensorDataFile.getAbsolutePath()), this.sensorDataZipFile);
            if (z10) {
                postSensorData();
            }
        } else {
            Log.e(str, "sensorDataZipFile does not exist");
        }
        reInitialiseSensorBiometricsData();
    }

    private void initialiseSensors() {
        HVLogUtils.d(TAG, "initialiseSensors() called");
        this.mSensorAccelerometer = this.mSensorManager.getDefaultSensor(1);
        this.mSensorGeoMagnetic = this.mSensorManager.getDefaultSensor(2);
        this.mSensorGyroscope = this.mSensorManager.getDefaultSensor(4);
        this.mSensorPressure = this.mSensorManager.getDefaultSensor(6);
        this.mSensorOrientation = this.mSensorManager.getDefaultSensor(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$registerSensors$0() {
        Sensor sensor = this.mSensorAccelerometer;
        if (sensor != null) {
            this.mSensorManager.registerListener(this.mSensorEventListener, sensor, ModuleDescriptor.MODULE_VERSION);
        } else {
            Log.d(TAG, "No accelerometer sensor");
        }
        Sensor sensor2 = this.mSensorGeoMagnetic;
        if (sensor2 != null) {
            this.mSensorManager.registerListener(this.mSensorEventListener, sensor2, ModuleDescriptor.MODULE_VERSION);
        } else {
            Log.d(TAG, "No geomagnetic sensor");
        }
        Sensor sensor3 = this.mSensorGyroscope;
        if (sensor3 != null) {
            this.mSensorManager.registerListener(this.mSensorEventListener, sensor3, ModuleDescriptor.MODULE_VERSION);
        } else {
            Log.d(TAG, "No gyroscope sensor");
        }
        Sensor sensor4 = this.mSensorPressure;
        if (sensor4 != null) {
            this.mSensorManager.registerListener(this.mSensorEventListener, sensor4, ModuleDescriptor.MODULE_VERSION);
        } else {
            Log.d(TAG, "No pressure sensor");
        }
        Sensor sensor5 = this.mSensorOrientation;
        if (sensor5 != null) {
            this.mSensorManager.registerListener(this.mSensorEventListener, sensor5, ModuleDescriptor.MODULE_VERSION);
        } else {
            Log.d(TAG, "No orientation sensor");
        }
        this.isHvSensorBiometricsRunning = true;
    }

    private void postSensorData() {
        HVLogUtils.d(TAG, "postSensorData() called");
        this.dataRepository.postSensorDataFiles(this.mContext, this.postSensorDataEndpoint, this.sensorDataZipFile);
    }

    private void reInitPostSensorDataEndpoint() {
        HVLogUtils.d(TAG, "reInitPostSensorDataEndpoint() called");
        this.postSensorDataEndpoint = BuildConfig.FLAVOR;
    }

    private void reInitSensorDataFiles() {
        HVLogUtils.d(TAG, "reInitSensorDataFiles() called");
        File file = new File(this.mContext.getFilesDir(), "hv/sensorData");
        createEmptyFile(file, this.sensorDataEventsFile.getName());
        createEmptyFile(file, this.accelerometerSensorDataFile.getName());
        createEmptyFile(file, this.geomagneticSensorDataFile.getName());
        createEmptyFile(file, this.gyroscopeSensorDataFile.getName());
        createEmptyFile(file, this.pressureSensorDataFile.getName());
        createEmptyFile(file, this.orientationSensorDataFile.getName());
    }

    private void reInitSensorDataJsonObjects() {
        HVLogUtils.d(TAG, "reInitSensorDataJsonObjects() called");
        this.sensorDataEventsJsonObject = new k();
        this.accelerometerSensorDataJsonObject = new k();
        this.geomagneticSensorDataJsonObject = new k();
        this.gyroscopeSensorDataJsonObject = new k();
        this.pressureSensorDataJsonObject = new k();
        this.orientationSensorDataJsonObject = new k();
    }

    private void reInitialiseSensorBiometricsData() {
        HVLogUtils.d(TAG, "reInitialiseSensorBiometricsData() called");
        reInitSensorDataJsonObjects();
        reInitSensorDataFiles();
        reInitPostSensorDataEndpoint();
    }

    private void registerSensors() {
        HVLogUtils.d(TAG, "registerSensors() called");
        this.executor.execute(new Runnable() { // from class: co.hyperverge.hypersnapsdk.service.sensorbiometrics.a
            @Override // java.lang.Runnable
            public final void run() {
                HVSensorBiometrics.this.lambda$registerSensors$0();
            }
        });
    }

    private void unregisterSensorListener() {
        String str = TAG;
        HVLogUtils.d(str, "unregisterSensorListener() called");
        SensorManager sensorManager = this.mSensorManager;
        if (sensorManager == null) {
            Log.d(str, "mSensorManager is null");
        } else {
            sensorManager.unregisterListener(this.mSensorEventListener);
            this.isHvSensorBiometricsRunning = false;
        }
    }

    private void unregisterSensorManager() {
        HVLogUtils.d(TAG, "unregisterSensorManager() called");
        unregisterSensorListener();
        writeCollectedSensorDataJsonObjectsToFiles();
    }

    private void writeCollectedSensorDataJsonObjectsToFiles() {
        HVLogUtils.d(TAG, "writeCollectedSensorDataJsonObjectsToFiles() called");
        writeCollectedSensorDataToFile(this.sensorDataEventsJsonObject, this.sensorDataEventsFile);
        writeCollectedSensorDataToFile(this.accelerometerSensorDataJsonObject, this.accelerometerSensorDataFile);
        writeCollectedSensorDataToFile(this.geomagneticSensorDataJsonObject, this.geomagneticSensorDataFile);
        writeCollectedSensorDataToFile(this.gyroscopeSensorDataJsonObject, this.gyroscopeSensorDataFile);
        writeCollectedSensorDataToFile(this.pressureSensorDataJsonObject, this.pressureSensorDataFile);
        writeCollectedSensorDataToFile(this.orientationSensorDataJsonObject, this.orientationSensorDataFile);
    }

    private void writeCollectedSensorDataToFile(k kVar, File file) {
        HVLogUtils.d(TAG, "writeCollectedSensorDataToFile() called with: sensorDataJsonObject = [" + kVar + "], sensorDataFile = [" + file + "]");
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                try {
                    bufferedWriter.append((CharSequence) kVar.toString());
                    bufferedWriter.newLine();
                    bufferedWriter.flush();
                    bufferedWriter.close();
                    fileWriter.close();
                } finally {
                }
            } finally {
            }
        } catch (Exception e10) {
            String str = TAG;
            HVLogUtils.e(str, "writeCollectedSensorDataToFile(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(str, Utils.getErrorMessage(e10));
        }
    }

    public void addSensorDataToRequestBody(JSONObject jSONObject) {
        HVLogUtils.d(TAG, "addSensorDataToRequestBody() called with: param = [" + jSONObject + "]");
        this.isSendingToServer = true;
        try {
            k kVar = new k();
            kVar.v("ag", this.geomagneticSensorDataJsonObject);
            kVar.v(C4870a.f43493a, this.accelerometerSensorDataJsonObject);
            kVar.v("g", this.gyroscopeSensorDataJsonObject);
            kVar.v("o", this.orientationSensorDataJsonObject);
            jSONObject.put("sdkData", Base64.encodeToString(kVar.toString().getBytes(StandardCharsets.UTF_8), 0));
        } catch (Exception e10) {
            HVLogUtils.e(TAG, "addSensorDataToRequestBody(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            }
        }
        this.isSendingToServer = false;
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof HVSensorBiometrics;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HVSensorBiometrics)) {
            return false;
        }
        HVSensorBiometrics hVSensorBiometrics = (HVSensorBiometrics) obj;
        if (!hVSensorBiometrics.canEqual(this) || getSamplingPeriodMicroseconds() != hVSensorBiometrics.getSamplingPeriodMicroseconds() || isHvSensorBiometricsRunning() != hVSensorBiometrics.isHvSensorBiometricsRunning() || isSendingToServer() != hVSensorBiometrics.isSendingToServer()) {
            return false;
        }
        Context mContext = getMContext();
        Context mContext2 = hVSensorBiometrics.getMContext();
        if (mContext != null ? !mContext.equals(mContext2) : mContext2 != null) {
            return false;
        }
        DataRepository dataRepository = getDataRepository();
        DataRepository dataRepository2 = hVSensorBiometrics.getDataRepository();
        if (dataRepository != null ? !dataRepository.equals(dataRepository2) : dataRepository2 != null) {
            return false;
        }
        String postSensorDataEndpointBluePrint = getPostSensorDataEndpointBluePrint();
        String postSensorDataEndpointBluePrint2 = hVSensorBiometrics.getPostSensorDataEndpointBluePrint();
        if (postSensorDataEndpointBluePrint != null ? !postSensorDataEndpointBluePrint.equals(postSensorDataEndpointBluePrint2) : postSensorDataEndpointBluePrint2 != null) {
            return false;
        }
        String postSensorDataEndpoint = getPostSensorDataEndpoint();
        String postSensorDataEndpoint2 = hVSensorBiometrics.getPostSensorDataEndpoint();
        if (postSensorDataEndpoint != null ? !postSensorDataEndpoint.equals(postSensorDataEndpoint2) : postSensorDataEndpoint2 != null) {
            return false;
        }
        k sensorDataEventsJsonObject = getSensorDataEventsJsonObject();
        k sensorDataEventsJsonObject2 = hVSensorBiometrics.getSensorDataEventsJsonObject();
        if (sensorDataEventsJsonObject != null ? !sensorDataEventsJsonObject.equals(sensorDataEventsJsonObject2) : sensorDataEventsJsonObject2 != null) {
            return false;
        }
        k accelerometerSensorDataJsonObject = getAccelerometerSensorDataJsonObject();
        k accelerometerSensorDataJsonObject2 = hVSensorBiometrics.getAccelerometerSensorDataJsonObject();
        if (accelerometerSensorDataJsonObject != null ? !accelerometerSensorDataJsonObject.equals(accelerometerSensorDataJsonObject2) : accelerometerSensorDataJsonObject2 != null) {
            return false;
        }
        k geomagneticSensorDataJsonObject = getGeomagneticSensorDataJsonObject();
        k geomagneticSensorDataJsonObject2 = hVSensorBiometrics.getGeomagneticSensorDataJsonObject();
        if (geomagneticSensorDataJsonObject != null ? !geomagneticSensorDataJsonObject.equals(geomagneticSensorDataJsonObject2) : geomagneticSensorDataJsonObject2 != null) {
            return false;
        }
        k gyroscopeSensorDataJsonObject = getGyroscopeSensorDataJsonObject();
        k gyroscopeSensorDataJsonObject2 = hVSensorBiometrics.getGyroscopeSensorDataJsonObject();
        if (gyroscopeSensorDataJsonObject != null ? !gyroscopeSensorDataJsonObject.equals(gyroscopeSensorDataJsonObject2) : gyroscopeSensorDataJsonObject2 != null) {
            return false;
        }
        k pressureSensorDataJsonObject = getPressureSensorDataJsonObject();
        k pressureSensorDataJsonObject2 = hVSensorBiometrics.getPressureSensorDataJsonObject();
        if (pressureSensorDataJsonObject != null ? !pressureSensorDataJsonObject.equals(pressureSensorDataJsonObject2) : pressureSensorDataJsonObject2 != null) {
            return false;
        }
        k orientationSensorDataJsonObject = getOrientationSensorDataJsonObject();
        k orientationSensorDataJsonObject2 = hVSensorBiometrics.getOrientationSensorDataJsonObject();
        if (orientationSensorDataJsonObject != null ? !orientationSensorDataJsonObject.equals(orientationSensorDataJsonObject2) : orientationSensorDataJsonObject2 != null) {
            return false;
        }
        File sensorDataEventsFile = getSensorDataEventsFile();
        File sensorDataEventsFile2 = hVSensorBiometrics.getSensorDataEventsFile();
        if (sensorDataEventsFile != null ? !sensorDataEventsFile.equals(sensorDataEventsFile2) : sensorDataEventsFile2 != null) {
            return false;
        }
        File accelerometerSensorDataFile = getAccelerometerSensorDataFile();
        File accelerometerSensorDataFile2 = hVSensorBiometrics.getAccelerometerSensorDataFile();
        if (accelerometerSensorDataFile != null ? !accelerometerSensorDataFile.equals(accelerometerSensorDataFile2) : accelerometerSensorDataFile2 != null) {
            return false;
        }
        File geomagneticSensorDataFile = getGeomagneticSensorDataFile();
        File geomagneticSensorDataFile2 = hVSensorBiometrics.getGeomagneticSensorDataFile();
        if (geomagneticSensorDataFile != null ? !geomagneticSensorDataFile.equals(geomagneticSensorDataFile2) : geomagneticSensorDataFile2 != null) {
            return false;
        }
        File gyroscopeSensorDataFile = getGyroscopeSensorDataFile();
        File gyroscopeSensorDataFile2 = hVSensorBiometrics.getGyroscopeSensorDataFile();
        if (gyroscopeSensorDataFile != null ? !gyroscopeSensorDataFile.equals(gyroscopeSensorDataFile2) : gyroscopeSensorDataFile2 != null) {
            return false;
        }
        File pressureSensorDataFile = getPressureSensorDataFile();
        File pressureSensorDataFile2 = hVSensorBiometrics.getPressureSensorDataFile();
        if (pressureSensorDataFile != null ? !pressureSensorDataFile.equals(pressureSensorDataFile2) : pressureSensorDataFile2 != null) {
            return false;
        }
        File orientationSensorDataFile = getOrientationSensorDataFile();
        File orientationSensorDataFile2 = hVSensorBiometrics.getOrientationSensorDataFile();
        if (orientationSensorDataFile != null ? !orientationSensorDataFile.equals(orientationSensorDataFile2) : orientationSensorDataFile2 != null) {
            return false;
        }
        File sensorDataZipFile = getSensorDataZipFile();
        File sensorDataZipFile2 = hVSensorBiometrics.getSensorDataZipFile();
        if (sensorDataZipFile != null ? !sensorDataZipFile.equals(sensorDataZipFile2) : sensorDataZipFile2 != null) {
            return false;
        }
        SensorManager mSensorManager = getMSensorManager();
        SensorManager mSensorManager2 = hVSensorBiometrics.getMSensorManager();
        if (mSensorManager != null ? !mSensorManager.equals(mSensorManager2) : mSensorManager2 != null) {
            return false;
        }
        Sensor mSensorAccelerometer = getMSensorAccelerometer();
        Sensor mSensorAccelerometer2 = hVSensorBiometrics.getMSensorAccelerometer();
        if (mSensorAccelerometer != null ? !mSensorAccelerometer.equals(mSensorAccelerometer2) : mSensorAccelerometer2 != null) {
            return false;
        }
        Sensor mSensorGeoMagnetic = getMSensorGeoMagnetic();
        Sensor mSensorGeoMagnetic2 = hVSensorBiometrics.getMSensorGeoMagnetic();
        if (mSensorGeoMagnetic != null ? !mSensorGeoMagnetic.equals(mSensorGeoMagnetic2) : mSensorGeoMagnetic2 != null) {
            return false;
        }
        Sensor mSensorGyroscope = getMSensorGyroscope();
        Sensor mSensorGyroscope2 = hVSensorBiometrics.getMSensorGyroscope();
        if (mSensorGyroscope != null ? !mSensorGyroscope.equals(mSensorGyroscope2) : mSensorGyroscope2 != null) {
            return false;
        }
        Sensor mSensorPressure = getMSensorPressure();
        Sensor mSensorPressure2 = hVSensorBiometrics.getMSensorPressure();
        if (mSensorPressure != null ? !mSensorPressure.equals(mSensorPressure2) : mSensorPressure2 != null) {
            return false;
        }
        Sensor mSensorOrientation = getMSensorOrientation();
        Sensor mSensorOrientation2 = hVSensorBiometrics.getMSensorOrientation();
        if (mSensorOrientation != null ? !mSensorOrientation.equals(mSensorOrientation2) : mSensorOrientation2 != null) {
            return false;
        }
        ExecutorService executor = getExecutor();
        ExecutorService executor2 = hVSensorBiometrics.getExecutor();
        if (executor != null ? !executor.equals(executor2) : executor2 != null) {
            return false;
        }
        SensorEventListener mSensorEventListener = getMSensorEventListener();
        SensorEventListener mSensorEventListener2 = hVSensorBiometrics.getMSensorEventListener();
        return mSensorEventListener != null ? mSensorEventListener.equals(mSensorEventListener2) : mSensorEventListener2 == null;
    }

    public void exitSensorBiometrics() {
        HVLogUtils.d(TAG, "stopSensorBiometrics() called");
        if (this.isHvSensorBiometricsRunning) {
            handleSensorData(false);
        }
    }

    public File getAccelerometerSensorDataFile() {
        return this.accelerometerSensorDataFile;
    }

    public k getAccelerometerSensorDataJsonObject() {
        return this.accelerometerSensorDataJsonObject;
    }

    public DataRepository getDataRepository() {
        return this.dataRepository;
    }

    public ExecutorService getExecutor() {
        return this.executor;
    }

    public File getGeomagneticSensorDataFile() {
        return this.geomagneticSensorDataFile;
    }

    public k getGeomagneticSensorDataJsonObject() {
        return this.geomagneticSensorDataJsonObject;
    }

    public File getGyroscopeSensorDataFile() {
        return this.gyroscopeSensorDataFile;
    }

    public k getGyroscopeSensorDataJsonObject() {
        return this.gyroscopeSensorDataJsonObject;
    }

    public Context getMContext() {
        return this.mContext;
    }

    public Sensor getMSensorAccelerometer() {
        return this.mSensorAccelerometer;
    }

    public SensorEventListener getMSensorEventListener() {
        return this.mSensorEventListener;
    }

    public Sensor getMSensorGeoMagnetic() {
        return this.mSensorGeoMagnetic;
    }

    public Sensor getMSensorGyroscope() {
        return this.mSensorGyroscope;
    }

    public SensorManager getMSensorManager() {
        return this.mSensorManager;
    }

    public Sensor getMSensorOrientation() {
        return this.mSensorOrientation;
    }

    public Sensor getMSensorPressure() {
        return this.mSensorPressure;
    }

    public File getOrientationSensorDataFile() {
        return this.orientationSensorDataFile;
    }

    public k getOrientationSensorDataJsonObject() {
        return this.orientationSensorDataJsonObject;
    }

    public String getPostSensorDataEndpoint() {
        return this.postSensorDataEndpoint;
    }

    public String getPostSensorDataEndpointBluePrint() {
        return this.postSensorDataEndpointBluePrint;
    }

    public File getPressureSensorDataFile() {
        return this.pressureSensorDataFile;
    }

    public k getPressureSensorDataJsonObject() {
        return this.pressureSensorDataJsonObject;
    }

    public int getSamplingPeriodMicroseconds() {
        return ModuleDescriptor.MODULE_VERSION;
    }

    public File getSensorDataEventsFile() {
        return this.sensorDataEventsFile;
    }

    public k getSensorDataEventsJsonObject() {
        return this.sensorDataEventsJsonObject;
    }

    public File getSensorDataZipFile() {
        return this.sensorDataZipFile;
    }

    public int hashCode() {
        int samplingPeriodMicroseconds = (((getSamplingPeriodMicroseconds() + 59) * 59) + (isHvSensorBiometricsRunning() ? 79 : 97)) * 59;
        int i10 = isSendingToServer() ? 79 : 97;
        Context mContext = getMContext();
        int hashCode = ((samplingPeriodMicroseconds + i10) * 59) + (mContext == null ? 43 : mContext.hashCode());
        DataRepository dataRepository = getDataRepository();
        int hashCode2 = (hashCode * 59) + (dataRepository == null ? 43 : dataRepository.hashCode());
        String postSensorDataEndpointBluePrint = getPostSensorDataEndpointBluePrint();
        int hashCode3 = (hashCode2 * 59) + (postSensorDataEndpointBluePrint == null ? 43 : postSensorDataEndpointBluePrint.hashCode());
        String postSensorDataEndpoint = getPostSensorDataEndpoint();
        int hashCode4 = (hashCode3 * 59) + (postSensorDataEndpoint == null ? 43 : postSensorDataEndpoint.hashCode());
        k sensorDataEventsJsonObject = getSensorDataEventsJsonObject();
        int hashCode5 = (hashCode4 * 59) + (sensorDataEventsJsonObject == null ? 43 : sensorDataEventsJsonObject.hashCode());
        k accelerometerSensorDataJsonObject = getAccelerometerSensorDataJsonObject();
        int hashCode6 = (hashCode5 * 59) + (accelerometerSensorDataJsonObject == null ? 43 : accelerometerSensorDataJsonObject.hashCode());
        k geomagneticSensorDataJsonObject = getGeomagneticSensorDataJsonObject();
        int hashCode7 = (hashCode6 * 59) + (geomagneticSensorDataJsonObject == null ? 43 : geomagneticSensorDataJsonObject.hashCode());
        k gyroscopeSensorDataJsonObject = getGyroscopeSensorDataJsonObject();
        int hashCode8 = (hashCode7 * 59) + (gyroscopeSensorDataJsonObject == null ? 43 : gyroscopeSensorDataJsonObject.hashCode());
        k pressureSensorDataJsonObject = getPressureSensorDataJsonObject();
        int hashCode9 = (hashCode8 * 59) + (pressureSensorDataJsonObject == null ? 43 : pressureSensorDataJsonObject.hashCode());
        k orientationSensorDataJsonObject = getOrientationSensorDataJsonObject();
        int hashCode10 = (hashCode9 * 59) + (orientationSensorDataJsonObject == null ? 43 : orientationSensorDataJsonObject.hashCode());
        File sensorDataEventsFile = getSensorDataEventsFile();
        int hashCode11 = (hashCode10 * 59) + (sensorDataEventsFile == null ? 43 : sensorDataEventsFile.hashCode());
        File accelerometerSensorDataFile = getAccelerometerSensorDataFile();
        int hashCode12 = (hashCode11 * 59) + (accelerometerSensorDataFile == null ? 43 : accelerometerSensorDataFile.hashCode());
        File geomagneticSensorDataFile = getGeomagneticSensorDataFile();
        int hashCode13 = (hashCode12 * 59) + (geomagneticSensorDataFile == null ? 43 : geomagneticSensorDataFile.hashCode());
        File gyroscopeSensorDataFile = getGyroscopeSensorDataFile();
        int hashCode14 = (hashCode13 * 59) + (gyroscopeSensorDataFile == null ? 43 : gyroscopeSensorDataFile.hashCode());
        File pressureSensorDataFile = getPressureSensorDataFile();
        int hashCode15 = (hashCode14 * 59) + (pressureSensorDataFile == null ? 43 : pressureSensorDataFile.hashCode());
        File orientationSensorDataFile = getOrientationSensorDataFile();
        int hashCode16 = (hashCode15 * 59) + (orientationSensorDataFile == null ? 43 : orientationSensorDataFile.hashCode());
        File sensorDataZipFile = getSensorDataZipFile();
        int hashCode17 = (hashCode16 * 59) + (sensorDataZipFile == null ? 43 : sensorDataZipFile.hashCode());
        SensorManager mSensorManager = getMSensorManager();
        int hashCode18 = (hashCode17 * 59) + (mSensorManager == null ? 43 : mSensorManager.hashCode());
        Sensor mSensorAccelerometer = getMSensorAccelerometer();
        int hashCode19 = (hashCode18 * 59) + (mSensorAccelerometer == null ? 43 : mSensorAccelerometer.hashCode());
        Sensor mSensorGeoMagnetic = getMSensorGeoMagnetic();
        int hashCode20 = (hashCode19 * 59) + (mSensorGeoMagnetic == null ? 43 : mSensorGeoMagnetic.hashCode());
        Sensor mSensorGyroscope = getMSensorGyroscope();
        int hashCode21 = (hashCode20 * 59) + (mSensorGyroscope == null ? 43 : mSensorGyroscope.hashCode());
        Sensor mSensorPressure = getMSensorPressure();
        int hashCode22 = (hashCode21 * 59) + (mSensorPressure == null ? 43 : mSensorPressure.hashCode());
        Sensor mSensorOrientation = getMSensorOrientation();
        int hashCode23 = (hashCode22 * 59) + (mSensorOrientation == null ? 43 : mSensorOrientation.hashCode());
        ExecutorService executor = getExecutor();
        int hashCode24 = (hashCode23 * 59) + (executor == null ? 43 : executor.hashCode());
        SensorEventListener mSensorEventListener = getMSensorEventListener();
        return (hashCode24 * 59) + (mSensorEventListener != null ? mSensorEventListener.hashCode() : 43);
    }

    public boolean isHvSensorBiometricsRunning() {
        return this.isHvSensorBiometricsRunning;
    }

    public boolean isSendingToServer() {
        return this.isSendingToServer;
    }

    public void pauseSensorBiometrics() {
        HVLogUtils.d(TAG, "pauseSensorBiometrics() called");
        unregisterSensorListener();
    }

    public void registerSensorBiometrics(String str) {
        HVLogUtils.d(TAG, "registerSensorBiometrics() called with: sensorDataZipFileName = [" + str + "]");
        reInitialiseSensorBiometricsData();
        createSensorDataZipFile(str);
        registerSensors();
    }

    public void resumeSensorBiometrics() {
        HVLogUtils.d(TAG, "resumeSensorBiometrics() called");
        registerSensors();
    }

    public void setAccelerometerSensorDataFile(File file) {
        this.accelerometerSensorDataFile = file;
    }

    public void setAccelerometerSensorDataJsonObject(k kVar) {
        this.accelerometerSensorDataJsonObject = kVar;
    }

    public void setGeomagneticSensorDataFile(File file) {
        this.geomagneticSensorDataFile = file;
    }

    public void setGeomagneticSensorDataJsonObject(k kVar) {
        this.geomagneticSensorDataJsonObject = kVar;
    }

    public void setGyroscopeSensorDataFile(File file) {
        this.gyroscopeSensorDataFile = file;
    }

    public void setGyroscopeSensorDataJsonObject(k kVar) {
        this.gyroscopeSensorDataJsonObject = kVar;
    }

    public void setHvSensorBiometricsRunning(boolean z10) {
        this.isHvSensorBiometricsRunning = z10;
    }

    public void setMSensorAccelerometer(Sensor sensor) {
        this.mSensorAccelerometer = sensor;
    }

    public void setMSensorGeoMagnetic(Sensor sensor) {
        this.mSensorGeoMagnetic = sensor;
    }

    public void setMSensorGyroscope(Sensor sensor) {
        this.mSensorGyroscope = sensor;
    }

    public void setMSensorOrientation(Sensor sensor) {
        this.mSensorOrientation = sensor;
    }

    public void setMSensorPressure(Sensor sensor) {
        this.mSensorPressure = sensor;
    }

    public void setOrientationSensorDataFile(File file) {
        this.orientationSensorDataFile = file;
    }

    public void setOrientationSensorDataJsonObject(k kVar) {
        this.orientationSensorDataJsonObject = kVar;
    }

    public void setPostSensorDataEndpoint(String str) {
        this.postSensorDataEndpoint = str;
    }

    public void setPressureSensorDataFile(File file) {
        this.pressureSensorDataFile = file;
    }

    public void setPressureSensorDataJsonObject(k kVar) {
        this.pressureSensorDataJsonObject = kVar;
    }

    public void setSendingToServer(boolean z10) {
        this.isSendingToServer = z10;
    }

    public void setSensorDataEventsFile(File file) {
        this.sensorDataEventsFile = file;
    }

    public void setSensorDataEventsJsonObject(k kVar) {
        this.sensorDataEventsJsonObject = kVar;
    }

    public void setSensorDataZipFile(File file) {
        this.sensorDataZipFile = file;
    }

    public void stopSensorBiometrics() {
        HVLogUtils.d(TAG, "stopSensorBiometrics() called");
        if (this.isHvSensorBiometricsRunning) {
            handleSensorData(true);
        }
    }

    public String toString() {
        return "HVSensorBiometrics(mContext=" + getMContext() + ", dataRepository=" + getDataRepository() + ", postSensorDataEndpointBluePrint=" + getPostSensorDataEndpointBluePrint() + ", postSensorDataEndpoint=" + getPostSensorDataEndpoint() + ", sensorDataEventsJsonObject=" + getSensorDataEventsJsonObject() + ", accelerometerSensorDataJsonObject=" + getAccelerometerSensorDataJsonObject() + ", geomagneticSensorDataJsonObject=" + getGeomagneticSensorDataJsonObject() + ", gyroscopeSensorDataJsonObject=" + getGyroscopeSensorDataJsonObject() + ", pressureSensorDataJsonObject=" + getPressureSensorDataJsonObject() + ", orientationSensorDataJsonObject=" + getOrientationSensorDataJsonObject() + ", sensorDataEventsFile=" + getSensorDataEventsFile() + ", accelerometerSensorDataFile=" + getAccelerometerSensorDataFile() + ", geomagneticSensorDataFile=" + getGeomagneticSensorDataFile() + ", gyroscopeSensorDataFile=" + getGyroscopeSensorDataFile() + ", pressureSensorDataFile=" + getPressureSensorDataFile() + ", orientationSensorDataFile=" + getOrientationSensorDataFile() + ", sensorDataZipFile=" + getSensorDataZipFile() + ", mSensorManager=" + getMSensorManager() + ", mSensorAccelerometer=" + getMSensorAccelerometer() + ", mSensorGeoMagnetic=" + getMSensorGeoMagnetic() + ", mSensorGyroscope=" + getMSensorGyroscope() + ", mSensorPressure=" + getMSensorPressure() + ", mSensorOrientation=" + getMSensorOrientation() + ", samplingPeriodMicroseconds=" + getSamplingPeriodMicroseconds() + ", executor=" + getExecutor() + ", isHvSensorBiometricsRunning=" + isHvSensorBiometricsRunning() + ", isSendingToServer=" + isSendingToServer() + ", mSensorEventListener=" + getMSensorEventListener() + ")";
    }

    public void updateSensorDataEvents(long j10, String str) {
        HVLogUtils.d(TAG, "updateSensorDataEvents() called with: timeStamp = [" + j10 + "], event = [" + str + "]");
        g gVar = new g();
        gVar.A(str);
        this.sensorDataEventsJsonObject.v(String.valueOf(j10), gVar);
    }
}
