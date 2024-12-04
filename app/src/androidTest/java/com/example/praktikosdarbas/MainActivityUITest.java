package com.example.praktikosdarbas;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class MainActivityUITest {

    @Test
    public void testRemoveExcessiveSpacesFromString() {

        String inputText = "Hello    world     with spaces!";
        String expectedText = "Hello world with spaces!";

        Espresso.onView(withId(R.id.editTextInput)).perform(ViewActions.replaceText(inputText));
        Espresso.onView(withId(R.id.buttonCount)).perform(ViewActions.click());

        Espresso.onView(withId(R.id.textViewWordCount)).check(matches(withText(expectedText)));
    }
}
