// Attente que le DOM soit complètement chargé avant d'exécuter le code
document.addEventListener('DOMContentLoaded', function () {
    // Sélection des éléments du DOM
    const taskInput = document.getElementById('taskInput'); // Champ de texte pour ajouter une nouvelle tâche
    const addTaskBtn = document.getElementById('addTaskBtn'); // Bouton d'ajout de tâche
    const taskList = document.getElementById('taskList'); // Liste des tâches

    // Ajout d'un écouteur d'événements pour le clic sur le bouton d'ajout
    addTaskBtn.addEventListener('click', function () {
        addTask(); // Appelle la fonction addTask lorsque le bouton est cliqué
    });

    // Ajout d'un écouteur d'événements pour les clics sur la liste des tâches
    taskList.addEventListener('click', function (event) {
        // Vérifie si l'élément cliqué est une tâche (LI)
        if (event.target.tagName === 'LI') {
            toggleTaskStatus(event.target); // Marque/démarque la tâche comme terminée
        } else if (event.target.classList.contains('delete-btn')) {
            deleteTask(event.target.parentElement); // Supprime la tâche si le bouton "Supprimer" est cliqué
        }
    });

    // Fonction pour ajouter une tâche à la liste
    function addTask() {
        const taskText = taskInput.value.trim(); // Récupère le texte de la tâche et supprime les espaces inutiles

        // Vérifie si le champ n'est pas vide
        if (taskText !== '') {
            const newTask = document.createElement('li'); // Crée un nouvel élément de liste
            newTask.className = 'list-group-item'; // Ajoute une classe à la tâche
            newTask.textContent = taskText; // Ajoute le texte de la tâche à l'élément LI

            const deleteBtn = document.createElement('button'); // Crée un bouton de suppression
            deleteBtn.className = 'btn btn-danger btn-sm float-right delete-btn'; // Ajoute des classes au bouton
            deleteBtn.textContent = 'Supprimer'; // Ajoute du texte au bouton

            newTask.appendChild(deleteBtn); // Ajoute le bouton de suppression à la tâche
            taskList.appendChild(newTask); // Ajoute la tâche à la liste

            taskInput.value = ''; // Réinitialiser le champ de texte
        }
    }

    // Fonction pour marquer/démarquer une tâche comme terminée
    function toggleTaskStatus(task) {
        task.classList.toggle('completed'); // Alterne la classe 'completed' pour marquer/démarquer la tâche
    }

    // Fonction pour supprimer une tâche de la liste
    function deleteTask(task) {
        task.remove(); // Supprime l'élément LI de la liste
    }
});
