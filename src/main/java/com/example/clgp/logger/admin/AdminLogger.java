// package com.example.clgp.logger.admin;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
// import org.springframework.boot.CommandLineRunner;
// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.annotation.Bean;

// import com.example.clgp.repo.admin.*;
// import com.example.clgp.model.admin.Admin;

// @SpringBootApplication
// public class AdminLogger {
//     private static final Logger mLogger= LoggerFactory.getLogger(AdminLogger.class);

//     public static void main(String[] args){
//         SpringApplication.run(AdminLogger.class);
//     }



//     @Bean
//     public CommandLineRunner demo(AdminRepo adRepo){
//         return (args) -> {
//             adRepo.save(new Admin("firstName", "lastName", "username", "9822222"));

//             mLogger.info("[+] Running command findAll for the admin");
//             mLogger.info("[+]                                      ");

//             for(Admin mAdmin: adRepo.findAll()){
//                 mLogger.info(mAdmin.toString());
//             }

//             mLogger.info("[+] testing checkkking......");
//         };
//     }
// }
