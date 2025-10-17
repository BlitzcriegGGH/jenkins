import java.nio.file.Files
import java.nio.file.Paths

def filePath = '/var/jenkins_home/workspace/Grosse pipeline/compose.yml'

// Lire tout le contenu du fichier en une seule fois
def fileContent = new String(Files.readAllBytes(Paths.get(filePath)))

// Afficher le contenu complet dans un seul echo pour éviter les retours multiples
echo """
------------------- Contenu du fichier -------------------
${fileContent}
----------------------------------------------------------
"""
