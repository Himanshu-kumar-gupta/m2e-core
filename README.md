# Eclipse IDE integration for Maven (Eclipse m2e project)

M2Eclipse provides tight integration for Apache Maven into the Eclipse IDE with the following features:
* Rich editor for pom.xml files
* Launching Maven builds from within Eclipse
* Dependency management for Eclipse build path based on Maven's pom.xml
* Resolving Maven dependencies from the Eclipse workspace without installing to local Maven repository
* Automatic downloading of the required dependencies from the remote Maven repositories
* Wizards for creating new Maven projects, pom.xml and to enable Maven support on plain Java project
* Quick search for dependencies in Maven remote repositories

See also https://projects.eclipse.org/projects/technology.m2e

## 📥 Installation

The recommended way is to install using the [Eclipse marketplace entry for m2e](https://marketplace.eclipse.org/content/eclipse-m2e-maven-support-eclipse-ide). Either using the installation tricks possible from the website or using the Eclipse Marketplace Client directly from within the IDE.  
⚠️ _Some other entries exist that look like m2e. They're usually outdated or incorrect. Please use the official one, linked above._

Alternatively, you can install the latest M2Eclipse release by using the _Install New Software_ dialog in Eclipse IDE, pointing it to this p2 repository: https://download.eclipse.org/technology/m2e/releases/latest/

For information about testing development builds, see [CONTRIBUTING.md](CONTRIBUTING.md).

## ⌨️ Contributing

See [CONTRIBUTING.md](CONTRIBUTING.md)

## ⚖️ License

See [LICENSE](LICENSE)
