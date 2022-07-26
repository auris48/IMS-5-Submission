package com.qa.ims.controller;

import com.qa.ims.persistence.dao.ItemDAO;
import com.qa.ims.persistence.domain.Item;
import com.qa.ims.utils.Utils;
import dnl.utils.text.table.TextTable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDate;
import java.util.List;

/**
 * Takes in Item details for CRUD functionality
 *
 */
public class ItemController implements CrudController<Item> {

	public static final Logger LOGGER = LogManager.getLogger();

	private ItemDAO itemDao;
	private Utils utils;

	public ItemController(ItemDAO itemDao, Utils utils) {
		super();
		this.itemDao = itemDao;
		this.utils = utils;
	}

	@Override
	public List<Item> readAll() {

		List<Item> items = itemDao.readAll();

		for (Item Item : items) {
			LOGGER.info(Item);
		}
		return items;
	}

	@Override
	public Item create() {
		LOGGER.info("Please enter item name");
		String itemName = utils.getString();
		LOGGER.info("Please enter item description");
		String itemDescription=utils.getString();
		LOGGER.info("Please enter item stock");
		int itemStock= utils.getInt();
		LOGGER.info("Please enter item price");
		double itemPrice= utils.getDouble();
		Item Item = itemDao.create(new Item(itemName, LocalDate.now(), itemDescription, itemStock, itemPrice));
		LOGGER.info("Item created");
		return Item;
	}

	@Override
	public Item update() {
		LOGGER.info("Please enter the id of the Item you would like to update");
		Long id = utils.getLong();
		LOGGER.info("Please enter item name");
		String itemName = utils.getString();
		LOGGER.info("Please enter new item stock date");
		LocalDate itemStockDate = utils.getLocalDate();
		LOGGER.info("Please enter item description");
		String itemDescription=utils.getString();;
		LOGGER.info("Please enter item stock");
		int itemStock= utils.getInt();
		LOGGER.info("Please enter item price");
		double itemPrice= utils.getDouble();
		Item Item = itemDao.update(new Item(id, itemName, itemStockDate, itemDescription, itemStock, itemPrice));
		LOGGER.info("Item updated");
		return Item;
	}

	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the Item you would like to delete");
		Long id = utils.getLong();
		return itemDao.delete(id);
	}
}
