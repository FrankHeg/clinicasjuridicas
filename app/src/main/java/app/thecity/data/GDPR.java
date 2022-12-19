package app.thecity.data;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

//import com.google.ads.consent.ConsentForm;
//import com.google.ads.consent.ConsentFormListener;
//import com.google.ads.consent.ConsentInfoUpdateListener;
//import com.google.ads.consent.ConsentInformation;
//import com.google.ads.consent.ConsentStatus;
//import com.google.ads.consent.DebugGeography;

import java.net.MalformedURLException;
import java.net.URL;

import app.thecity.BuildConfig;
import app.thecity.R;
import app.thecity.advertise.AdConfig;

public class GDPR {

    public static Bundle getBundleAd(Activity act) {
        Bundle extras = new Bundle();
       // ConsentInformation consentInformation = ConsentInformation.getInstance(act);
     //   if (consentInformation.getConsentStatus().equals(ConsentStatus.NON_PERSONALIZED)) {
      //      extras.putString("npa", "1");
       // }
        return extras;
    }

    public static void updateConsentStatus(final Activity act) {
       // ConsentInformation consentInformation = ConsentInformation.getInstance(act);


    }

    private static class GDPRForm {

     //   private ConsentForm form;

        private Activity activity;

        private GDPRForm(Activity act) {
            activity = act;
        }

        private void displayConsentForm() {
        }

        private URL getUrlPrivacyPolicy(Activity act) {
            URL mUrl = null;
            try {
                mUrl = new URL(act.getString(R.string.privacy_policy_url));
            } catch (MalformedURLException e) {
                Log.e("GDPR", e.getMessage());
            }
            return mUrl;
        }
    }


}
