import ui.SdmSplassScreen;

public class SdmLaunch {
    private static final int splashDuration = 2000; // time in MS to show splash screen

    public SdmLaunch() {
        launch();
    }

    private void launch() {
        new SdmSplassScreen(splashDuration).showSplash();
        System.exit(0);
    }
}
