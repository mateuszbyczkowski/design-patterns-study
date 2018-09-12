package obserwator.stacjaMeteo.subject;

import obserwator.stacjaMeteo.observer.Obserwator;

public interface Podmiot {
    void zarejestrujObserwatora(Obserwator obserwator);
    void usunObserwatora(Obserwator obserwator);
    void powiadomObserwatorow();
}
