# LocalNotesApp 📝

A modern, full-featured Local Note-Taking Application for Android. This project is built entirely with Kotlin and Jetpack Compose, adhering strictly to Clean Architecture principles to ensure a highly scalable, maintainable, and testable codebase.

## ✨ Features

The application provides a robust and clean user experience with the following capabilities:

* **CRUD Functionality:** Easily Create, Read, Update, and Delete notes stored locally.
* **Dynamic Sorting:** Sort the list of notes by Title, Date (Timestamp), or Color in both ascending and descending order.
* **Custom Colors:** Assign one of several pre-defined colors to a note for organization.
* **Undo Deletion:** Quick action to restore a recently deleted note using a Snackbar.
* **Intuitive UI:** A single-activity user interface crafted entirely with Jetpack Compose.
* **Input Validation:** Title and content fields are validated before saving a note.

## 📐 Architecture & Technology Stack

This app is structured to reflect professional, large-scale application development standards.

### Architecture

The project employs **Clean Architecture** which separates concerns into three layers:

* **Presentation Layer:** Contains Jetpack Compose UI and MVVM (ViewModel) logic, handling UI state and events.
* **Domain Layer:** The core of the application, holding the business logic (Note Entities, Use Cases, Repository interfaces). It is completely independent of Android frameworks.
* **Data Layer:** Handles external concerns, primarily Room Database access, implementing the domain's Repository interface.

### Technology Stack

| Category | Technology | Purpose |
| :--- | :--- | :--- |
| **Language** | Kotlin | Primary programming language. |
| **UI** | Jetpack Compose | Modern, declarative UI framework. |
| **Architecture** | MVVM / Clean Architecture | UI layer pattern and overall project structure. |
| **Data** | Room Persistence Library | Local database for efficient data storage (SQLite abstraction). |
| **Asynchrony** | Kotlin Coroutines & Flow | Handling asynchronous operations and observing data streams. |
| **Dependency Injection** | Dagger Hilt | Simplifying dependency management and service location. |
