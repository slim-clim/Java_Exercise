import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ChildrenHealthCentrePageGenerator {
    public static void main(String[] args) {
        String fileName = "index.html";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(generateHTML());
            System.out.println("Landing page generated successfully: " + fileName);
        } catch (IOException e) {
            System.err.println("Error generating file: " + e.getMessage());
        }
    }

    private static String generateHTML() {
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>HappyHearts Children's Health Centre</title>\n" +
                "    <style>\n" +
                "        * {\n" +
                "            margin: 0;\n" +
                "            padding: 0;\n" +
                "            box-sizing: border-box;\n" +
                "            font-family: 'Comic Sans MS', cursive, sans-serif;\n" +
                "        }\n" +
                "        \n" +
                "        body {\n" +
                "            background-color: #f0f8ff;\n" +
                "            color: #333;\n" +
                "            line-height: 1.6;\n" +
                "        }\n" +
                "        \n" +
                "        header {\n" +
                "            background: linear-gradient(135deg, #ff9a9e 0%, #fad0c4 100%);\n" +
                "            padding: 1rem 0;\n" +
                "            box-shadow: 0 2px 10px rgba(0,0,0,0.1);\n" +
                "        }\n" +
                "        \n" +
                "        .container {\n" +
                "            width: 90%;\n" +
                "            max-width: 1200px;\n" +
                "            margin: 0 auto;\n" +
                "            padding: 0 20px;\n" +
                "        }\n" +
                "        \n" +
                "        nav {\n" +
                "            display: flex;\n" +
                "            justify-content: space-between;\n" +
                "            align-items: center;\n" +
                "        }\n" +
                "        \n" +
                "        .logo {\n" +
                "            display: flex;\n" +
                "            align-items: center;\n" +
                "            font-size: 1.8rem;\n" +
                "            font-weight: bold;\n" +
                "            color: #fff;\n" +
                "        }\n" +
                "        \n" +
                "        .logo-icon {\n" +
                "            margin-right: 10px;\n" +
                "            font-size: 2rem;\n" +
                "        }\n" +
                "        \n" +
                "        .nav-links {\n" +
                "            display: flex;\n" +
                "            list-style: none;\n" +
                "        }\n" +
                "        \n" +
                "        .nav-links li {\n" +
                "            margin-left: 25px;\n" +
                "        }\n" +
                "        \n" +
                "        .nav-links a {\n" +
                "            color: white;\n" +
                "            text-decoration: none;\n" +
                "            font-weight: bold;\n" +
                "            transition: color 0.3s;\n" +
                "        }\n" +
                "        \n" +
                "        .nav-links a:hover {\n" +
                "            color: #ffcc80;\n" +
                "        }\n" +
                "        \n" +
                "        .hero {\n" +
                "            background: linear-gradient(rgba(255, 255, 255, 0.9), rgba(255, 255, 255, 0.9)), url('https://images.unsplash.com/photo-1519494026892-80bbd07d3eaa?ixlib=rb-4.0.3&auto=format&fit=crop&w=1950&q=80');\n" +
                "            background-size: cover;\n" +
                "            background-position: center;\n" +
                "            padding: 100px 0;\n" +
                "            text-align: center;\n" +
                "            border-radius: 0 0 50px 50px;\n" +
                "            margin-bottom: 50px;\n" +
                "        }\n" +
                "        \n" +
                "        .hero h1 {\n" +
                "            font-size: 3.5rem;\n" +
                "            color: #ff6b6b;\n" +
                "            margin-bottom: 20px;\n" +
                "            text-shadow: 2px 2px 4px rgba(0,0,0,0.1);\n" +
                "        }\n" +
                "        \n" +
                "        .hero p {\n" +
                "            font-size: 1.3rem;\n" +
                "            color: #666;\n" +
                "            max-width: 800px;\n" +
                "            margin: 0 auto 30px;\n" +
                "        }\n" +
                "        \n" +
                "        .btn {\n" +
                "            display: inline-block;\n" +
                "            background: #ff6b6b;\n" +
                "            color: white;\n" +
                "            padding: 12px 30px;\n" +
                "            border-radius: 50px;\n" +
                "            text-decoration: none;\n" +
                "            font-weight: bold;\n" +
                "            font-size: 1.1rem;\n" +
                "            transition: all 0.3s ease;\n" +
                "            box-shadow: 0 4px 15px rgba(255, 107, 107, 0.3);\n" +
                "        }\n" +
                "        \n" +
                "        .btn:hover {\n" +
                "            background: #ff4757;\n" +
                "            transform: translateY(-3px);\n" +
                "            box-shadow: 0 6px 20px rgba(255, 107, 107, 0.4);\n" +
                "        }\n" +
                "        \n" +
                "        .section {\n" +
                "            padding: 60px 0;\n" +
                "        }\n" +
                "        \n" +
                "        .section-title {\n" +
                "            text-align: center;\n" +
                "            margin-bottom: 50px;\n" +
                "            color: #ff6b6b;\n" +
                "            font-size: 2.2rem;\n" +
                "        }\n" +
                "        \n" +
                "        .services-grid {\n" +
                "            display: grid;\n" +
                "            grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));\n" +
                "            gap: 30px;\n" +
                "        }\n" +
                "        \n" +
                "        .service-card {\n" +
                "            background: white;\n" +
                "            border-radius: 20px;\n" +
                "            padding: 30px;\n" +
                "            text-align: center;\n" +
                "            box-shadow: 0 5px 15px rgba(0,0,0,0.05);\n" +
                "            transition: transform 0.3s ease;\n" +
                "        }\n" +
                "        \n" +
                "        .service-card:hover {\n" +
                "            transform: translateY(-10px);\n" +
                "        }\n" +
                "        \n" +
                "        .service-icon {\n" +
                "            font-size: 3rem;\n" +
                "            color: #ff9a9e;\n" +
                "            margin-bottom: 20px;\n" +
                "        }\n" +
                "        \n" +
                "        .service-card h3 {\n" +
                "            color: #ff6b6b;\n" +
                "            margin-bottom: 15px;\n" +
                "        }\n" +
                "        \n" +
                "        .about-content {\n" +
                "            display: flex;\n" +
                "            align-items: center;\n" +
                "            gap: 50px;\n" +
                "        }\n" +
                "        \n" +
                "        .about-text {\n" +
                "            flex: 1;\n" +
                "        }\n" +
                "        \n" +
                "        .about-image {\n" +
                "            flex: 1;\n" +
                "            border-radius: 20px;\n" +
                "            overflow: hidden;\n" +
                "            box-shadow: 0 10px 30px rgba(0,0,0,0.1);\n" +
                "        }\n" +
                "        \n" +
                "        .about-image img {\n" +
                "            width: 100%;\n" +
                "            height: auto;\n" +
                "            display: block;\n" +
                "        }\n" +
                "        \n" +
                "        .testimonials {\n" +
                "            background: linear-gradient(135deg, #ff9a9e 0%, #fad0c4 100%);\n" +
                "            padding: 80px 0;\n" +
                "            border-radius: 50px;\n" +
                "            margin: 50px 0;\n" +
                "        }\n" +
                "        \n" +
                "        .testimonial-grid {\n" +
                "            display: grid;\n" +
                "            grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));\n" +
                "            gap: 30px;\n" +
                "        }\n" +
                "        \n" +
                "        .testimonial-card {\n" +
                "            background: white;\n" +
                "            padding: 30px;\n" +
                "            border-radius: 20px;\n" +
                "            box-shadow: 0 5px 15px rgba(0,0,0,0.05);\n" +
                "        }\n" +
                "        \n" +
                "        .testimonial-card p {\n" +
                "            font-style: italic;\n" +
                "            margin-bottom: 20px;\n" +
                "        }\n" +
                "        \n" +
                "        .testimonial-author {\n" +
                "            display: flex;\n" +
                "            align-items: center;\n" +
                "        }\n" +
                "        \n" +
                "        .author-avatar {\n" +
                "            width: 60px;\n" +
                "            height: 60px;\n" +
                "            border-radius: 50%;\n" +
                "            margin-right: 15px;\n" +
                "            object-fit: cover;\n" +
                "        }\n" +
                "        \n" +
                "        .author-info h4 {\n" +
                "            color: #ff6b6b;\n" +
                "        }\n" +
                "        \n" +
                "        .contact-form {\n" +
                "            max-width: 600px;\n" +
                "            margin: 0 auto;\n" +
                "            background: white;\n" +
                "            padding: 40px;\n" +
                "            border-radius: 20px;\n" +
                "            box-shadow: 0 10px 30px rgba(0,0,0,0.1);\n" +
                "        }\n" +
                "        \n" +
                "        .form-group {\n" +
                "            margin-bottom: 25px;\n" +
                "        }\n" +
                "        \n" +
                "        .form-group label {\n" +
                "            display: block;\n" +
                "            margin-bottom: 8px;\n" +
                "            font-weight: bold;\n" +
                "            color: #555;\n" +
                "        }\n" +
                "        \n" +
                "        .form-group input,\n" +
                "        .form-group textarea {\n" +
                "            width: 100%;\n" +
                "            padding: 12px;\n" +
                "            border: 2px solid #e0e0e0;\n" +
                "            border-radius: 10px;\n" +
                "            font-size: 1rem;\n" +
                "        }\n" +
                "        \n" +
                "        .form-group textarea {\n" +
                "            height: 150px;\n" +
                "            resize: vertical;\n" +
                "        }\n" +
                "        \n" +
                "        footer {\n" +
                "            background: linear-gradient(135deg, #ff9a9e 0%, #fad0c4 100%);\n" +
                "            color: white;\n" +
                "            padding: 50px 0 20px;\n" +
                "            text-align: center;\n" +
                "        }\n" +
                "        \n" +
                "        .footer-content {\n" +
                "            display: flex;\n" +
                "            justify-content: space-around;\n" +
                "            flex-wrap: wrap;\n" +
                "            margin-bottom: 30px;\n" +
                "        }\n" +
                "        \n" +
                "        .footer-section {\n" +
                "            margin: 20px;\n" +
                "            min-width: 250px;\n" +
                "        }\n" +
                "        \n" +
                "        .footer-section h3 {\n" +
                "            margin-bottom: 20px;\n" +
                "            font-size: 1.3rem;\n" +
                "        }\n" +
                "        \n" +
                "        .footer-links {\n" +
                "            list-style: none;\n" +
                "        }\n" +
                "        \n" +
                "        .footer-links li {\n" +
                "            margin-bottom: 10px;\n" +
                "        }\n" +
                "        \n" +
                "        .footer-links a {\n" +
                "            color: white;\n" +
                "            text-decoration: none;\n" +
                "        }\n" +
                "        \n" +
                "        .social-icons {\n" +
                "            display: flex;\n" +
                "            justify-content: center;\n" +
                "            gap: 15px;\n" +
                "            margin-top: 20px;\n" +
                "        }\n" +
                "        \n" +
                "        .social-icons a {\n" +
                "            color: white;\n" +
                "            font-size: 1.5rem;\n" +
                "            transition: transform 0.3s;\n" +
                "        }\n" +
                "        \n" +
                "        .social-icons a:hover {\n" +
                "            transform: scale(1.2);\n" +
                "        }\n" +
                "        \n" +
                "        .copyright {\n" +
                "            margin-top: 30px;\n" +
                "            padding-top: 20px;\n" +
                "            border-top: 1px solid rgba(255,255,255,0.2);\n" +
                "        }\n" +
                "        \n" +
                "        @media (max-width: 768px) {\n" +
                "            .nav-links {\n" +
                "                display: none;\n" +
                "            }\n" +
                "            \n" +
                "            .about-content {\n" +
                "                flex-direction: column;\n" +
                "            }\n" +
                "            \n" +
                "            .hero h1 {\n" +
                "                font-size: 2.5rem;\n" +
                "            }\n" +
                "            \n" +
                "            .section-title {\n" +
                "                font-size: 1.8rem;\n" +
                "            }\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <header>\n" +
                "        <div class=\"container\">\n" +
                "            <nav>\n" +
                "                <div class=\"logo\">\n" +
                "                    <span class=\"logo-icon\">❤️</span>\n" +
                "                    <span>HappyHearts</span>\n" +
                "                </div>\n" +
                "                <ul class=\"nav-links\">\n" +
                "                    <li><a href=\"#services\">Services</a></li>\n" +
                "                    <li><a href=\"#about\">About Us</a></li>\n" +
                "                    <li><a href=\"#testimonials\">Testimonials</a></li>\n" +
                "                    <li><a href=\"#contact\">Contact</a></li>\n" +
                "                </ul>\n" +
                "            </nav>\n" +
                "        </div>\n" +
                "    </header>\n" +
                "    \n" +
                "    <section class=\"hero\">\n" +
                "        <div class=\"container\">\n" +
                "            <h1>Where Little Smiles Grow Big</h1>\n" +
                "            <p>Providing compassionate, specialized healthcare for children in a friendly, welcoming environment. Your child's health and happiness are our top priorities.</p>\n" +
                "            <a href=\"#contact\" class=\"btn\">Book an Appointment</a>\n" +
                "        </div>\n" +
                "    </section>\n" +
                "    \n" +
                "    <section id=\"services\" class=\"section\">\n" +
                "        <div class=\"container\">\n" +
                "            <h2 class=\"section-title\">Our Services</h2>\n" +
                "            <div class=\"services-grid\">\n" +
                "                <div class=\"service-card\">\n" +
                "                    <div class=\"service-icon\">🩺</div>\n" +
                "                    <h3>Regular Check-ups</h3>\n" +
                "                    <p>Comprehensive wellness exams to monitor your child's growth and development.</p>\n" +
                "                </div>\n" +
                "                <div class=\"service-card\">\n" +
                "                    <div class=\"service-icon\">💉</div>\n" +
                "                    <h3>Vaccinations</h3>\n" +
                "                    <p>Up-to-date immunizations to protect your child from preventable diseases.</p>\n" +
                "                </div>\n" +
                "                <div class=\"service-card\">\n" +
                "                    <div class=\"service-icon\">🦷</div>\n" +
                "                    <h3>Dental Care</h3>\n" +
                "                    <p>Specialized dental services for children of all ages.</p>\n" +
                "                </div>\n" +
                "                <div class=\"service-card\">\n" +
                "                    <div class=\"service-icon\">🧠</div>\n" +
                "                    <h3>Developmental Screenings</h3>\n" +
                "                    <p>Early detection of developmental delays and interventions.</p>\n" +
                "                </div>\n" +
                "                <div class=\"service-card\">\n" +
                "                    <div class=\"service-icon\">🍎</div>\n" +
                "                    <h3>Nutrition Counseling</h3>\n" +
                "                    <p>Expert guidance on healthy eating habits for growing children.</p>\n" +
                "                </div>\n" +
                "                <div class=\"service-card\">\n" +
                "                    <div class=\"service-icon\">😊</div>\n" +
                "                    <h3>Behavioral Health</h3>\n" +
                "                    <p>Support for emotional and behavioral challenges.</p>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "    </section>\n" +
                "    \n" +
                "    <section id=\"about\" class=\"section\">\n" +
                "        <div class=\"container\">\n" +
                "            <h2 class=\"section-title\">About HappyHearts</h2>\n" +
                "            <div class=\"about-content\">\n" +
                "                <div class=\"about-text\">\n" +
                "                    <p>HappyHearts Children's Health Centre has been serving families in our community for over 15 years. Our team of pediatric specialists is dedicated to providing the highest quality care in a warm, child-friendly environment.</p>\n" +
                "                    <p>We believe that healthy children lead to healthy futures. Our approach combines medical expertise with a deep understanding of child development to ensure each child receives personalized care.</p>\n" +
                "                    <p>Our facility is designed with children in mind - colorful, engaging, and welcoming. We understand that visiting the doctor can be stressful for children, so we've created an environment that helps them feel comfortable and at ease.</p>\n" +
                "                </div>\n" +
                "                <div class=\"about-image\">\n" +
                "                    <img src=\"https://images.unsplash.com/photo-1581591798180-115e43253b01?ixlib=rb-4.0.3&auto=format&fit=crop&w=1950&q=80\" alt=\"Happy children at the health centre\">\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "    </section>\n" +
                "    \n" +
                "    <section id=\"testimonials\" class=\"testimonials\">\n" +
                "        <div class=\"container\">\n" +
                "            <h2 class=\"section-title\">What Parents Say</h2>\n" +
                "            <div class=\"testimonial-grid\">\n" +
                "                <div class=\"testimonial-card\">\n" +
                "                    <p>\"The staff at HappyHearts made my son's first visit to the dentist so much easier than I expected. They were patient, kind, and really knew how to make him feel comfortable.\"\n" +
                "                    <div class=\"testimonial-author\">\n" +
                "                        <img src=\"https://randomuser.me/api/portraits/women/32.jpg\" alt=\"Parent\" class=\"author-avatar\">\n" +
                "                        <div class=\"author-info\">\n" +
                "                            <h4>Sarah Johnson</h4>\n" +
                "                            <p>Mother of 4-year-old</p>\n" +
                "                        </div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "                <div class=\"testimonial-card\">\n" +
                "                    <p>\"We've been coming to HappyHearts for 6 years now. The doctors are amazing with children and take the time to explain everything in a way both I and my kids can understand.\"\n" +
                "                    <div class=\"testimonial-author\">\n" +
                "                        <img src=\"https://randomuser.me/api/portraits/men/22.jpg\" alt=\"Parent\" class=\"author-avatar\">\n" +
                "                        <div class=\"author-info\">\n" +
                "                            <h4>Michael Rodriguez</h4>\n" +
                "                            <p>Father of 8 and 10-year-olds</p>\n" +
                "                        </div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "                <div class=\"testimonial-card\">\n" +
                "                    <p>\"The developmental screening program at HappyHearts helped us identify and address my daughter's speech delay early. The support we received was incredible.\"\n" +
                "                    <div class=\"testimonial-author\">\n" +
                "                        <img src=\"https://randomuser.me/api/portraits/women/44.jpg\" alt=\"Parent\" class=\"author-avatar\">\n" +
                "                        <div class=\"author-info\">\n" +
                "                            <h4>Emily Chen</h4>\n" +
                "                            <p>Mother of 3-year-old</p>\n" +
                "                        </div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "    </section>\n" +
                "    \n" +
                "    <section id=\"contact\" class=\"section\">\n" +
                "        <div class=\"container\">\n" +
                "            <h2 class=\"section-title\">Contact Us</h2>\n" +
                "            <div class=\"contact-form\">\n" +
                "                <div class=\"form-group\">\n" +
                "                    <label for=\"name\">Parent's Name</label>\n" +
                "                    <input type=\"text\" id=\"name\" placeholder=\"Your name\">\n" +
                "                </div>\n" +
                "                <div class=\"form-group\">\n" +
                "                    <label for=\"email\">Email</label>\n" +
                "                    <input type=\"email\" id=\"email\" placeholder=\"Your email\">\n" +
                "                </div>\n" +
                "                <div class=\"form-group\">\n" +
                "                    <label for=\"phone\">Phone</label>\n" +
                "                    <input type=\"tel\" id=\"phone\" placeholder=\"Your phone number\">\n" +
                "                </div>\n" +
                "                <div class=\"form-group\">\n" +
                "                    <label for=\"child-age\">Child's Age</label>\n" +
                "                    <input type=\"number\" id=\"child-age\" placeholder=\"Child's age\">\n" +
                "                </div>\n" +
                "                <div class=\"form-group\">\n" +
                "                    <label for=\"message\">Message</label>\n" +
                "                    <textarea id=\"message\" placeholder=\"Your message or concerns\"></textarea>\n" +
                "                </div>\n" +
                "                <button type=\"submit\" class=\"btn\">Submit</button>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "    </section>\n" +
                "    \n" +
                "    <footer>\n" +
                "        <div class=\"container\">\n" +
                "            <div class=\"footer-content\">\n" +
                "                <div class=\"footer-section\">\n" +
                "                    <h3>HappyHearts</h3>\n" +
                "                    <p>Providing compassionate care for children since 2008.</p>\n" +
                "                </div>\n" +
                "                <div class=\"footer-section\">\n" +
                "                    <h3>Quick Links</h3>\n" +
                "                    <ul class=\"footer-links\">\n" +
                "                        <li><a href=\"#services\">Services</a></li>\n" +
                "                        <li><a href=\"#about\">About Us</a></li>\n" +
                "                        <li><a href=\"#testimonials\">Testimonials</a></li>\n" +
                "                        <li><a href=\"#contact\">Contact</a></li>\n" +
                "                    </ul>\n" +
                "                </div>\n" +
                "                <div class=\"footer-section\">\n" +
                "                    <h3>Contact Info</h3>\n" +
                "                    <ul class=\"footer-links\">\n" +
                "                        <li>📍 123 Rainbow Lane, Playtown</li>\n" +
                "                        <li>📞 (555) 123-4567</li>\n" +
                "                        <li>✉️ info@happyhearts.org</li>\n" +
                "                    </ul>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "            <div class=\"social-icons\">\n" +
                "                <a href=\"#\">📱</a>\n" +
                "                <a href=\"#\">📘</a>\n" +
                "                <a href=\"#\">📸</a>\n" +
                "            </div>\n" +
                "            <div class=\"copyright\">\n" +
                "                <p>&copy; 2023 HappyHearts Children's Health Centre. All rights reserved.</p>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "    </footer>\n" +
                "</body>\n" +
                "</html>";
    }
}