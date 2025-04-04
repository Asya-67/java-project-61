plugins {
    id("java")
    id("application") // Подключаем плагин application
    id("com.github.ben-manes.versions") version "0.46.0" // Убедитесь, что используете последнюю версию
    id("checkstyle")
}

checkstyle {
    toolVersion = "10.12.4" // Укажите актуальную версию Checkstyle
    configFile = file("config/checkstyle/checkstyle.xml") // Указываем путь к конфигурационному файлу
    isIgnoreFailures = false  // Прерывать сборку при ошибках
    isShowViolations = true   // Показывать ошибки в консоли
}


group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

application {
    this.mainClass.set("hexlet.code.App") // Указываем точку входа в приложение
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}
