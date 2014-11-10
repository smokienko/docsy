package docsy.android.smokiyenko.com.docsy;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.view.View;
import android.widget.TextView;

/**
 * Created by s.mokiyenko on 11/10/14.
 */
public class MaiActivityTest extends ActivityInstrumentationTestCase2<MainActivity>{


    public MaiActivityTest(Class<MainActivity> activityClass) {
        super(activityClass);
    }

    public void testTextIsPresent() {

        final Activity mainActivity = getActivity();

        final TextView mainText = (TextView) getActivity().findViewById(R.id.tv_main_label);

        assertEquals(mainText.getText().toString(), mainActivity.getString(R.string.welcome_docsy));
        assertEquals(mainText.getVisibility(), View.VISIBLE);

    }
}
