Author - Radhika Woodruff

This project aims to aid in the creation and cataloging of beading projects.
A central design area exists.
A workspace per user can be created where the user can design a jewelry project, import an existing design
template or search a design template in the project to guide a beader.  Once a project is completed,
the work space will be searchable and provides images which can be shared via links.
People can rate finished projects and leave comments.

We will initially have this working on a desktop and work our way to having it as a mobile application.

Ideas for creation management are:
- A searchable area where designs can be stored
  - A design is made up of design-templates, instructions, and material list
    - object formats are text, audio, picture, and video
- Users can provide ratings and feedback comments per design

Ideas for cataloging:
- finished projects

Ideas to do -
- what has been done
    * pictures
    * instructions
    * cost of materials
- future projects
    * instructions
    * items needed
- bead catalog
    * by color
    * by type and size
- beads to be purchased
    * stores
    * cost per store and size
    
    
```mermaid
flowchart TD
    user(User)
    d(Database)
    b(Bead Service)
    f(Bead Frontend)
    user---->f
    b---->d
    f---->b
```
