<<<<<<< HEAD
# Базовый репозиторий для задания №3

## Инструкция
1. Сделайте [fork](https://docs.github.com/en/get-started/quickstart/fork-a-repo) репозитория
2. Настройте систему сборки [maven](https://maven.apache.org/) или [gradle](https://gradle.org/)
    * [Работа с maven в IDEA](https://www.jetbrains.com/help/idea/maven-support.html)
    * [Работа с gradle в IDEA](https://www.jetbrains.com/help/idea/gradle.html)
3. Используйте этот репозиторий в процессе работы над своей задачей. Весь код и необходимые артефакты
должны быть в репозитории на момент сдачи. **Обязательное условие**: ваше решение должно содержать тесты,
которые должны **успешно проходить**. Дополнительная информация по конфигурации сборки:
   * Если вы используете Maven, то вам необходимо явно указать необходимую версию JDK (не ниже 1.8). Пример конфигурации
   для Java и JDK 11:
   ```xml
   <properties>
        <jvm.version>11</jvm.version>
        <maven.compiler.source>${jvm.version}</maven.compiler.source>
        <maven.compiler.target>${jvm.version}</maven.compiler.target>
    </properties>
   ```
   Если все сконфигурировано правильно, то при запуске команды `mvn package` в консоль будет выводиться информация
   о сборке и запущенных тестах. Пример необходимого вывода:
   ```shell
   ...
   [INFO] -------------------------------------------------------
   [INFO]  T E S T S
   [INFO] -------------------------------------------------------
   [INFO] 
   [INFO] Results:
   [INFO] 
   [INFO] Tests run: 7, Failures: 0, Errors: 0, Skipped: 0
   [INFO] 
   [INFO] ------------------------------------------------------------------------
   [INFO] BUILD SUCCESS
   [INFO] ------------------------------------------------------------------------
   [INFO] Total time:  20.524 s
   [INFO] Finished at: 2022-02-01T22:28:30+03:00
   [INFO] ------------------------------------------------------------------------
   ```
   * Если вы используете Gradle, то ничего дополнительного делать не нужно. Перед сдачей своего решения убедитесь, что
   при запуске команды `./gradlew build` (или `./gradlew test`) в папке `build/test-results/test` генерируется xml файл
   с отчетом о выполненных тестах. Пример успешного выполнения команды `./gradlew build`:
   ```shell
   BUILD SUCCESSFUL in 7s
   7 actionable tasks: 7 executed
   ```
   В той же директории, в которой у вас находится файл `build.gradle` (или `build.gradle.kts`), должна появиться директория `build`.
   В результате выполнения команды `./gradlew build` должен сгенерироваться файл с именем `build/test-results/test/TEST-myapp.test.Test.xml`,
   где `myapp.test.Test` &mdash; имя вашего тестового класса. Если тестовых классов несколько, то для каждого из них генерируется отдельный отчет.
4. Чтобы сдать задание откройте [pull request](https://docs.github.com/en/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/creating-a-pull-request-from-a-fork)
    * В качестве `base repository` выберите этот (базовый) репозиторий. В качестве ветки `base` выберите ветку `main`
    * В качестве `head repository` выберите ваш репозиторий (fork). В качестве ветки `compare` выберите ветку 'main'
    * В заголовке PR укажите ваше имя, название задания, и номер группы
    * например, "Иванов И.И., 'Шашки рэндзю', гр. 3530901/00006"


=======
# Surrounded_and_Hunted

A [libGDX](https://libgdx.com/) project generated with [gdx-liftoff](https://github.com/tommyettinger/gdx-liftoff).

This project was generated with a template that includes Kotlin application launchers and an empty `ApplicationAdapter` implemented in Kotlin.

## Platforms

- `core`: Main module with the application logic shared by all platforms.
- `lwjgl3`: Primary desktop platform using LWJGL3.
- `android`: Android mobile platform. Needs Android SDK.

## Gradle

This project uses [Gradle](http://gradle.org/) to manage dependencies.
The Gradle wrapper was included, so you can run Gradle tasks using `gradlew.bat` or `./gradlew` commands.
Useful Gradle tasks and flags:

- `--continue`: when using this flag, errors will not stop the tasks from running.
- `--daemon`: thanks to this flag, Gradle daemon will be used to run chosen tasks.
- `--offline`: when using this flag, cached dependency archives will be used.
- `--refresh-dependencies`: this flag forces validation of all dependencies. Useful for snapshot versions.
- `android:lint`: performs Android project validation.
- `build`: builds sources and archives of every project.
- `cleanEclipse`: removes Eclipse project data.
- `cleanIdea`: removes IntelliJ project data.
- `clean`: removes `build` folders, which store compiled classes and built archives.
- `eclipse`: generates Eclipse project data.
- `idea`: generates IntelliJ project data.
- `lwjgl3:jar`: builds application's runnable jar, which can be found at `lwjgl3/build/libs`.
- `lwjgl3:run`: starts the application.
- `test`: runs unit tests (if any).

Note that most tasks that are not specific to a single project can be run with `name:` prefix, where the `name` should be replaced with the ID of a specific project.
For example, `core:clean` removes `build` folder only from the `core` project.
>>>>>>> master
