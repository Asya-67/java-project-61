install:
	chmod +x ./gradlew
	./gradlew installDist

run-dist: install
	./build/install/java-project-61/bin/java-project-61

