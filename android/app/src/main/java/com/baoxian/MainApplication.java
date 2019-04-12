package com.baoxian;

import android.app.Application;

//import com.facebook.react.BuildConfig;
import com.facebook.react.ReactApplication;
import com.RNFetchBlob.RNFetchBlobPackage;
import io.realm.react.RealmReactPackage;
import fr.greweb.reactnativeviewshot.RNViewShotPackage;
import com.brentvatne.react.ReactVideoPackage;
import com.tencent.bugly.crashreport.CrashReport;
import com.zmxv.RNSound.RNSoundPackage;
import com.oblador.shimmer.RNShimmerPackage;
import com.lewin.qrcode.QRScanReaderPackage;
import org.wonday.pdf.RCTPdfView;
import com.BV.LinearGradient.LinearGradientPackage;
import com.reactnative.ivpusic.imagepicker.PickerPackage;
import com.AlexanderZaytsev.RNI18n.RNI18nPackage;
import com.swmansion.gesturehandler.react.RNGestureHandlerPackage;
import com.reactlibraryftp.RNFtpPackage;
import com.rnfs.RNFSPackage;
import com.reactlibrary2.RNReactNativeDocViewerPackage;
import com.learnium.RNDeviceInfo.RNDeviceInfo;
import com.lwansbrough.RCTCamera.RCTCameraPackage;
import com.rnim.rn.audio.ReactNativeAudioPackage;
import com.syan.agora.AgoraPackage;
import com.airbnb.android.react.lottie.LottiePackage;
//import org.reactnative.camera.RNCameraPackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;

import java.util.Arrays;
import java.util.List;
import com.horcrux.svg.SvgPackage;

public class MainApplication extends Application implements ReactApplication {

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
            new MainReactPackage(),
            new RNGestureHandlerPackage(),
            new RNFetchBlobPackage(),
            new RealmReactPackage(),
            new RNViewShotPackage(),
            new ReactVideoPackage(),
            new RNSoundPackage(),
            new RNShimmerPackage(),
            new QRScanReaderPackage(),
            new RCTPdfView(),
            new LinearGradientPackage(),
            new PickerPackage(),
            new RNI18nPackage(),
            new RNFtpPackage(),
            new RNFSPackage(),
            new RNReactNativeDocViewerPackage(),
            new RNDeviceInfo(),
            new RCTCameraPackage(),
//          new RNCameraPackage(),
            new ReactNativeAudioPackage(),
              new AgoraPackage(),
            new LottiePackage(),
            new SvgPackage()
      );
    }

    @Override
    protected String getJSMainModuleName() {
      return "index";
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    CrashReport.initCrashReport(getApplicationContext(), "69f6140097", true);
    SoLoader.init(this, /* native exopackage */ false);
  }
}