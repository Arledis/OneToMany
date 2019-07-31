package com.example.codeclan.Filetrackerserive.components;



import com.example.codeclan.Filetrackerserive.models.File;
import com.example.codeclan.Filetrackerserive.models.Folder;
import com.example.codeclan.Filetrackerserive.models.User;
import com.example.codeclan.Filetrackerserive.repository.FileRepository;
import com.example.codeclan.Filetrackerserive.repository.FolderRepository;
import com.example.codeclan.Filetrackerserive.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args){
        Folder mainDocuments = new Folder("Documents");
        folderRepository.save(mainDocuments);

        File MusicExchange = new File("Music Exchange Project", "java", 200, mainDocuments);
        fileRepository.save(MusicExchange);

        User ale = new User("Arledis");
        userRepository.save(ale);


    }
}

