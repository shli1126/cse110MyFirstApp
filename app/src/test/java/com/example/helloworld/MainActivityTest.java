package com.example.helloworld;
import static androidx.lifecycle.Lifecycle.State.*;

import androidx.lifecycle.Lifecycle;
import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.appcompat.app.AppCompatActivity;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

import android.widget.TextView;
@RunWith(AndroidJUnit4.class)
public class MainActivityTest extends AppCompatActivity {
    @Test
    public void testStudentNameIsDisplayed() {
        try(ActivityScenario<MainActivity> scenario = ActivityScenario.launch(MainActivity.class)) {
            scenario.onActivity(activity -> {
                TextView textView = activity.findViewById(R.id.name);
                String test_string = textView.getText().toString();
                assertEquals(View.INVISIBLE, textView.getVisibility());
                assertEquals(test_string, "group name");
            });
        }
    }

}
