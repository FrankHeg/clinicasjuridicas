package app.thecity.advertise;



import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;




import java.util.Arrays;

import app.thecity.BuildConfig;
import app.thecity.R;
import app.thecity.data.GDPR;
import app.thecity.data.SharedPref;
import app.thecity.data.ThisApplication;

public class AdNetworkHelper {

    private static final String TAG = AdNetworkHelper.class.getSimpleName();

    private final Activity activity;
    private final SharedPref sharedPref;

    //Interstitial


    public AdNetworkHelper(Activity activity) {
        this.activity = activity;
        sharedPref = new SharedPref(activity);
    }

    public static void init(ThisApplication thisApplication) {
    }


    public void showGDPR() {
        if (!AdConfig.ad_enable || !AdConfig.ENABLE_GDPR) return;
        if (AdConfig.ad_network == AdConfig.AdNetworkType.ADMOB) {
            GDPR.updateConsentStatus(activity);
        }
    }












    // for facebook bidding ads


    private static int dpToPx(Context c, int dp) {
        Resources r = c.getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
    }




}
