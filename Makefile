install:
	chmod +x ./gradlew
	./gradlew installDist

run-dist: install
	./build/install/app/bin/app