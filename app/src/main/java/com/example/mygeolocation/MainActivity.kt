package com.example.mygeolocation

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.mygeolocation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

//    Создать приложение с основным экраном в виде карты и
//    следующими требованиями:
//    ● Приложение должно находить устройство по геолокации.
//    ● На карте можно ставить маркеры.
//    ● На отдельном экране можно посмотреть и отредактировать
//    список маркеров, добавить к маркеру название и аннотацию.
//    ● Выбор архитектуры и библиотек остается за вами.

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_map, R.id.navigation_list_marker, R.id.navigation_not_use
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }
}