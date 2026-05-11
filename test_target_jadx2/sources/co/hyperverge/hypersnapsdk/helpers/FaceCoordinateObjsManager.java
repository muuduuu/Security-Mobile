package co.hyperverge.hypersnapsdk.helpers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class FaceCoordinateObjsManager {
    private static List<FaceCoordinateObject> faceCoordinates = new ArrayList();
    private static int maxCount = 5;

    public FaceCoordinateObjsManager() {
        faceCoordinates = new ArrayList();
    }

    public static synchronized void addNewFaceCoordinateObject(ArrayList<Float> arrayList, long j10, long j11) {
        synchronized (FaceCoordinateObjsManager.class) {
            addNewFaceCoordinateObject(new FaceCoordinateObject(arrayList, j10, j11));
        }
    }

    public static synchronized void clearFaceCoordinateObjects() {
        synchronized (FaceCoordinateObjsManager.class) {
            faceCoordinates.clear();
        }
    }

    public static synchronized FaceCoordinateObject getLatestFaceCoordinateObject() {
        synchronized (FaceCoordinateObjsManager.class) {
            if (faceCoordinates.size() == 0) {
                return null;
            }
            FaceCoordinateObject faceCoordinateObject = faceCoordinates.get(r1.size() - 1);
            if (faceCoordinateObject.hasExpired()) {
                return null;
            }
            return faceCoordinateObject;
        }
    }

    public static class FaceCoordinateObject {
        private List<Float> coordinates;
        private long detectionTimeStamp;
        private long frameTimeStamp;

        public FaceCoordinateObject(ArrayList<Float> arrayList, long j10, long j11) {
            this.coordinates = arrayList;
            this.frameTimeStamp = j10;
            this.detectionTimeStamp = j11;
        }

        public float getBottomRightX() {
            return this.coordinates.get(2).floatValue();
        }

        public float getBottomRightY() {
            return this.coordinates.get(3).floatValue();
        }

        public List<Float> getCoordinates() {
            return this.coordinates;
        }

        public long getDetectionTimeStamp() {
            return this.detectionTimeStamp;
        }

        public long getFrameTimeStamp() {
            return this.frameTimeStamp;
        }

        public float getTopLeftX() {
            return this.coordinates.get(0).floatValue();
        }

        public float getTopLeftY() {
            return this.coordinates.get(1).floatValue();
        }

        public boolean hasExpired() {
            return this.detectionTimeStamp + 1500 < System.currentTimeMillis() || this.frameTimeStamp + 1700 < System.currentTimeMillis();
        }

        public void setCoordinates(List<Float> list) {
            this.coordinates = list;
        }

        public void setDetectionTimeStamp(long j10) {
            this.detectionTimeStamp = j10;
        }

        public FaceCoordinateObject(long j10) {
            this.frameTimeStamp = j10;
        }
    }

    public static synchronized void addNewFaceCoordinateObject(FaceCoordinateObject faceCoordinateObject) {
        synchronized (FaceCoordinateObjsManager.class) {
            try {
                Iterator<FaceCoordinateObject> it = faceCoordinates.iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    FaceCoordinateObject next = it.next();
                    if (next.hasExpired()) {
                        it.remove();
                    } else if (next.frameTimeStamp > faceCoordinateObject.getFrameTimeStamp()) {
                        break;
                    } else {
                        i10++;
                    }
                }
                faceCoordinates.add(i10, faceCoordinateObject);
                if (faceCoordinates.size() > maxCount) {
                    faceCoordinates.remove(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
