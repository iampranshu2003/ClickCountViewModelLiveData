# Click Count App

## Overview

This Android app is a simple project developed to grasp the concepts of View Model and Live Data in Android application development. The app allows users to increment a counter, and the real-time updates are reflected using View Model and Live Data.

## Features

- **Counter Increment:** Users can click a button to increment the counter, and the UI is updated in real-time.

## Getting Started

To explore and understand the implementation of View Model and Live Data, follow these steps:

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/clickcount-app.git
   ```

2. Open the project in Android Studio.

3. Run the app on an emulator or a physical device.

## Code Structure

### MainActivity

The `MainActivity` class is the main activity of the app, where the UI components are initialized, and the counter is updated in response to a button click.

```kotlin
// Code snippet from MainActivity
class MainActivity : AppCompatActivity() {
    var count = 0
    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        // ... (initialize UI components)

        btnClick.setOnClickListener {
            // Increment counter on button click
            count++
            viewModel.updateCount()
        }
    }
}
```

### MainActivityViewModel

The `MainActivityViewModel` class is a ViewModel that manages the UI-related data for the `MainActivity`. It uses Live Data to observe and react to changes in the data.

```kotlin
// Code snippet from MainActivityViewModel
class MainActivityViewModel : ViewModel() {
    var count = MutableLiveData<Int>()

    init {
        // Initialize the counter value
        count.value = 0
    }

    fun updateCount() {
        // Update the counter value
        count.value = (count.value)?.plus(1)
    }
}
```

## Dependencies

No external dependencies are used in this project.

## Notes

- The `ViewModel` class helps in managing and persisting UI-related data across configuration changes.

- Live Data is used to observe changes in the counter value, ensuring that the UI is always up-to-date.

Feel free to explore and modify the code to deepen your understanding of View Model and Live Data in Android development. Happy coding!
