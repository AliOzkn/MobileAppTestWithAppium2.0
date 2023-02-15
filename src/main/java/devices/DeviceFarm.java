package devices;

public enum DeviceFarm {
    ANDROID_S("src/main/resources/capabilities/android-s.json");

    public String path;
    DeviceFarm(String path){
        this.path = path;
    }
}
