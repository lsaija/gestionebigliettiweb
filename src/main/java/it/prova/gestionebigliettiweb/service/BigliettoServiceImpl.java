package it.prova.gestionebigliettiweb.service;

import java.util.List;

import javax.persistence.EntityManager;

import it.prova.gestionebigliettiweb.dao.BigliettoDAO;
import it.prova.gestionebigliettiweb.model.Biglietto;
import it.prova.gestionebigliettiweb.web.listener.LocalEntityManagerFactoryListener;

public class BigliettoServiceImpl implements BigliettoService {
	private BigliettoDAO bigliettoDao;

	public void setBigliettoDao(BigliettoDAO bigliettoDao) {
		this.bigliettoDao = bigliettoDao;
	}

	@Override
	public List<Biglietto> listAll() throws Exception {

		EntityManager entityManager = LocalEntityManagerFactoryListener.getEntityManager();

		try {

			bigliettoDao.setEntityManager(entityManager);

			return bigliettoDao.list();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			LocalEntityManagerFactoryListener.closeEntityManager(entityManager);
		}
	}

	@Override
	public Biglietto caricaSingoloElemento(Long idInput) throws Exception {

		EntityManager entityManager = LocalEntityManagerFactoryListener.getEntityManager();

		try {

			bigliettoDao.setEntityManager(entityManager);

			return bigliettoDao.findOne(idInput);

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			LocalEntityManagerFactoryListener.closeEntityManager(entityManager);
		}
	}

	@Override
	public void aggiorna(Biglietto input) throws Exception {
		EntityManager entityManager = LocalEntityManagerFactoryListener.getEntityManager();

		try {

			entityManager.getTransaction().begin();

			bigliettoDao.setEntityManager(entityManager);

			bigliettoDao.update(input);

			entityManager.getTransaction().commit();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			e.printStackTrace();
			throw e;
		} finally {
			LocalEntityManagerFactoryListener.closeEntityManager(entityManager);
		}
	}

	@Override
	public void inserisciNuovo(Biglietto input) throws Exception {

		EntityManager entityManager = LocalEntityManagerFactoryListener.getEntityManager();

		try {

			entityManager.getTransaction().begin();

			bigliettoDao.setEntityManager(entityManager);

			bigliettoDao.insert(input);

			entityManager.getTransaction().commit();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			e.printStackTrace();
			throw e;
		} finally {
			LocalEntityManagerFactoryListener.closeEntityManager(entityManager);
		}

	}

	@Override
	public void rimuovi(Long idBigliettoToRemove) throws Exception {
		EntityManager entityManager = LocalEntityManagerFactoryListener.getEntityManager();

		try {

			entityManager.getTransaction().begin();

			bigliettoDao.setEntityManager(entityManager);

			bigliettoDao.delete(bigliettoDao.findOne(idBigliettoToRemove));

			entityManager.getTransaction().commit();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			e.printStackTrace();
			throw e;
		} finally {
			LocalEntityManagerFactoryListener.closeEntityManager(entityManager);
		}
	}

	@Override
	public List<Biglietto> findByExample(Biglietto input) throws Exception {

		EntityManager entityManager = LocalEntityManagerFactoryListener.getEntityManager();

		try {

			bigliettoDao.setEntityManager(entityManager);

			return bigliettoDao.findByExample(input);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			LocalEntityManagerFactoryListener.closeEntityManager(entityManager);
		}
	}

}
