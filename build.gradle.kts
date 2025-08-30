plugins {
	kotlin("jvm") version "2.0.0"
	id("java")
}
repositories {
	mavenCentral() 
	maven {
		name = "papermc"
		url = uri("https://repo.papermc.io/repository/maven-public/")
	}
}
dependencies {
	implementation(kotlin("stdlib"))
	compileOnly("io.papermc.paper:paper-api:1.20.1-R0.1-SNAPSHOT")
}
java {
	toolchain.languageVersion.set(JavaLanguageVersion.of(21))
}
tasks.jar {
	archiveFileName.set("Full-Metal-Jacket.jar")
	manifest {
		attributes(
			"Built-By" to "StresseR",
			"Main-Class" to "pkg.fmj.fake_main.Fake_mainKt"
		)
	}
	from ({
		configurations.runtimeClasspath.get().map {
			if (it.isDirectory()) it else zipTree(it)
		}
	})
}