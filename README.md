JSONToViewModel
===============


Le principe est simple :

On click sur le bouton; on envoie alors l'objet JSON apparaissant au même moment dans la boite de dialogue.
Si le test passe, alors le JSON est directement converti en objet ViewModel dans le serveur. l'object est sauvegardé et on envoie une réponse au client. Ce dernier charge alors la page "/display" qui va afficher les données du ViewModel.

Afin de tester une nouvelle structure de données, il suffit de changer le ViewModel et le JSON.
