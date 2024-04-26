package mate.academy.util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory sessionFactory = initSessionFactory();

    private HibernateUtil() {
    }

    private static SessionFactory initSessionFactory() {
        try {
            return new Configuration().configure().buildSessionFactory();
        } catch (HibernateException e) {
            throw new HibernateException("Can't create session factory.", e);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
