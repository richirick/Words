package com.example.wordsapp

import android.app.Application
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.navigation.Navigation
import androidx.navigation.testing.TestNavHostController
import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.runner.AndroidJUnit4
import junit.framework.TestCase.assertEquals
import org.junit.runner.RunWith

//https://developer.android.com/guide
@RunWith(AndroidJUnit4::class) //1. Указываю поля исполнителя тестов
class NavigationTests {

    //2. Создаю тестовую функцию:
    fun navigate_tow_words_nav_component() {
        //3. Создаю в методе тестовый экземпляр котроллера навигации.
        val navController = TestNavHostController(
            ApplicationProvider.getApplicationContext()
        )
        //4. Изоляция фрагмента для тестирования. Передаю тему приложения чтобы компоненты
        //пользовательского интерфейса знали, какую тему использовать,
        // иначе тест может завершиться сбоем.
        val letterListScenario = launchFragmentInContainer<LetterListFragment>(themeResId =
        R.style.Theme_Words)

        //5. Явно объявляю желаемый граф навигации что бы котролер навигации использовал его для
        //запуска фрагмента
        letterListScenario.onFragment { fragment ->
            navController.setGraph(R.navigation.nav_graph)

            Navigation.setViewNavController(fragment.requireView(), navController)
        }
        //6. Запускаю событие которое запрашивает навигацию.
        onView(withId(R.id.recycler_view))
            .perform(RecyclerViewActions
                .actionOnItemAtPosition<RecyclerView.ViewHolder>(2, click()))

        assertEquals(navController.currentDestination?.id, R.id.wordListFragment)
    }
}