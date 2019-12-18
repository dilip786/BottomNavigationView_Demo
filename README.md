### BottomNavigationView Demo

A simple android demo that demonstrates how to implement BottomNavigationView in Kotlin

### Key Points

- app:itemBackground — The background color to be used for the bottom navigation menu
- app:itemIconTint — The tint to be used for the icons in the bottom navigation menu
- app:itemTextColor — The color to be used for the text in the bottom navigation menu
- app:menu — The menu resource to be used to display items in the bottom navigation menu

### Code setup

```
  implementation 'com.google.android.material:material:1.2.0-alpha02'
```
```
<com.google.android.material.bottomnavigation.BottomNavigationView
        android:id="@+id/bNavigationView"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="@android:color/holo_blue_dark"
        app:itemIconTint="@drawable/nav_icon_color"
        app:itemTextColor="@android:color/white"
        app:menu="@menu/bottom_navigation_menu" />
```

```
<menu xmlns:android="http://schemas.android.com/apk/res/android">

    <item
        android:id="@+id/navigation_home"
        android:icon="@drawable/home_icon"
        android:title="Home" />

    <item
        android:id="@+id/navigation_history"
        android:icon="@drawable/history_icon"
        android:title="History" />

    <item
        android:id="@+id/navigation_my_account"
        android:icon="@drawable/my_account"
        android:title="My Account" />

</menu>
```
```
bNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    attachFragment(FirstFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.navigation_history -> {
                    attachFragment(SecondFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.navigation_my_account -> {
                    attachFragment(ThirdFragment())
                    return@setOnNavigationItemSelectedListener true
                }
            }
            false
        }
```


