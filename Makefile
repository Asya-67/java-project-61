install:
	chmod +x ./gradlew
	./gradlew installDist

run-dist: install
	$(PWD)/build/install/app/bin/app