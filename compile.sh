cd ../NEKOS.API
echo "==== Compiling NEKOS.API ===="
./gradlew build
for f in ../NEKOS/lib/jars/NEKOS_API.jar ../NEKOS.ExamplePlugin/lib/jars/NEKOS_API.jar ../NEKOS.Discord/lib/jars/NEKOS_API.jar ; do cp build/libs/NEKOS_API.jar $f; done

echo "==== Compiling NEKOS.ExamplePlugin ===="
cd ../NEKOS.ExamplePlugin
./gradlew build

echo "==== Compiling NEKOS ===="
cd ../NEKOS
cp ../NEKOS.ExamplePlugin/build/libs/NEKOS_EXAMPLEPLUGIN.jar plugins/
./gradlew build
