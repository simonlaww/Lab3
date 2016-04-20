package tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.android.lab3.MainActivity;

/**
 * Created by Simon on 4/19/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2 {

    public JUnit_test() {

        super(MainActivity.class)
    }

    public void test_first() {
        mainActivity = getActivity();

        TextView textView = (TextView) mainActivity.findViewbyId(R.id.tv1);
        String tester = textView.getText().toString();

        assertEquals("Bye World", tester);
    }
}
