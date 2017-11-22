package models

import java.util.UUID


case class MainMenu(id: UUID, menuname: String, link: String, cssname: String)

case class SecondaryMenu(id: UUID, menuname: String, link: String, cssname: String)
